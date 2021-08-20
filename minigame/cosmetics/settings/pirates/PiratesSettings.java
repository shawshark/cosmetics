package net.shawshark.core.plugin.minigame.cosmetics.settings.pirates;

import jdk.internal.joptsimple.internal.Strings;
import lombok.Getter;
import net.shawshark.core.plugin.database.CorePlayer;
import net.shawshark.core.plugin.database.DataTable;
import net.shawshark.core.plugin.database.SqlInputType;
import net.shawshark.core.plugin.minigame.cosmetics.settings.AbstractCosmetics;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class PiratesSettings extends AbstractCosmetics {

    @Getter private PiratesCosmeticsPlayer cosmeticsPlayer;
    @Getter private boolean setupDatabase = false;

    public PiratesSettings(CorePlayer corePlayer) {
        super(corePlayer);
        this.cosmeticsPlayer = new PiratesCosmeticsPlayer(this);

        if(!isSetupDatabase()) {
            // Setup each datatype
            for(PiratesCosmeticsType type : PiratesCosmeticsType.values()) {
                if(type != null)
                    getDatabaseManager().runSqlCommandLine(getCreateTableQuery(type), null);
            }
            setupDatabase = true;
        }
        // load each type
        for(PiratesCosmeticsType type : PiratesCosmeticsType.values()) {
            if(type != null)
                load(type);
        }
    }

    @Override
    public String getCosmeticsPlatform() {
        return "Pirates";
    }

    @Override
    public void load(Object type) {
        log(false, "Loading cosmetic (" + type + ") settings for " + getCorePlayer().getName());
        if(!(type instanceof PiratesCosmeticsType)) return;

        PiratesCosmeticsType dataType = (PiratesCosmeticsType) type;
        String tableName = getTableName(dataType.getTableName());

        String key = getCorePlayer().getPlayerUUID().toString().replace("-", "");
        String query = "SELECT * FROM " + tableName + " WHERE UUID = '" + key + "';";

        DataTable uuid = new DataTable("UUID", "", DataTable.DataType.STRING);
        DataTable activeTypeID = new DataTable("active_id", "", DataTable.DataType.INTEGER);
        DataTable purchasedIDS = new DataTable("purchased_ids", "", DataTable.DataType.LONGTEXT);

        List<DataTable> col = Arrays.asList(uuid, activeTypeID, purchasedIDS);

        System.out.println("before getData from Load() dataType = " + dataType);

        getDatabaseManager().getData("UUID", query, response -> {
            int activeID = -1;
            String purchasedID = "";

            if(response.containsKey(key) && response.get(key).size() > 0) {
                for(DataTable ta : response.get(key)) {
                    if(ta.getName().equalsIgnoreCase("active_id")) {
                        activeID = (Integer) ta.getData();
                    } else if(ta.getName().equalsIgnoreCase("purchased_ids")) {
                        purchasedID = (String) ta.getData();
                        System.out.println(dataType.toString() + ": purchaseID: " + purchasedID);
                    }
                }
            }

            if(activeID != -1) {
                getCosmeticsPlayer().getSettings(dataType).setActiveID(activeID);
            }
            if(purchasedID.length() > 0) {
                List<Integer> purchased = Arrays.stream(purchasedID.split(","))
                        .map(id -> Integer.parseInt(id))
                        .collect(Collectors.toList());
                System.out.println("printing array: " + purchased);
                getCosmeticsPlayer().getSettings(dataType).setPurchased(purchased);
            }
        }, col.toArray(new DataTable[col.size()]));
    }

    @Override
    public void save(Object type) {
        log(false, "Saving cosmetic settings for " + getCorePlayer().getName());

        if(!(type instanceof PiratesCosmeticsType)) return;

        int activeID = -1;
        String purchaseID = "";

        PiratesCosmeticsType dataType = (PiratesCosmeticsType) type;
        PiratesCosmeticsPlayer.Settings settings = getCosmeticsPlayer().getSettings(dataType);
        activeID = settings.getActiveID();
        if(!settings.getPurchased().isEmpty()) {
            purchaseID = join(settings.getPurchased()
                    .stream()
                    .map(id -> String.valueOf(id))
                    .collect(Collectors.toList()), ",");
        }

        DataTable uuid = new DataTable("UUID", getCorePlayer().getPlayerUUID().toString().replace("-", ""), DataTable.DataType.STRING);
        DataTable activeTypeID = new DataTable("active_id", activeID, DataTable.DataType.INTEGER);
        DataTable purchasedHatIDS = new DataTable("purchased_ids", purchaseID, DataTable.DataType.LONGTEXT);

        getDatabaseManager().insertData(SqlInputType.REPLACE_INTO, getTableName(dataType.getTableName()),
                Arrays.asList(uuid, activeTypeID, purchasedHatIDS), response -> {

            log(false, (response == -1 ? "Failed to save " : "Saved ") +
                    dataType.getTableName() + " cosmetics for core player " + getCorePlayer().getName());
        });
    }

    public static String join( Iterable<String> pieces, String separator ) {
        StringBuilder buffer = new StringBuilder();

        for (Iterator<String> iter = pieces.iterator(); iter.hasNext(); ) {
            buffer.append( iter.next() );

            if ( iter.hasNext() )
                buffer.append( separator );
        }

        return buffer.toString();
    }
}