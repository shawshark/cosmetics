package net.shawshark.core.plugin.minigame.cosmetics.settings;

import lombok.Getter;
import net.shawshark.core.CorePlugin;
import net.shawshark.core.plugin.database.CorePlayer;
import net.shawshark.core.plugin.database.DatabaseManager;
import net.shawshark.core.plugin.minigame.cosmetics.settings.pirates.PiratesCosmeticsType;

public abstract class AbstractCosmetics {

    @Getter private CorePlayer corePlayer;
    @Getter private DatabaseManager databaseManager;

    public AbstractCosmetics(CorePlayer corePlayer) {
        this.corePlayer = corePlayer;
        this.databaseManager = corePlayer.getPlayerDataManager().getDatabaseManager();
    }

    public abstract String getCosmeticsPlatform();
    public abstract void load(Object type);
    public abstract void save(Object type);

    public String getTableName(String type) {
        return getCosmeticsPlatform() + "_cosmetic_data_" + type;
    }

    public void log(boolean debug, String message) {
        if(debug && CorePlugin.getCorePlugin().isDebug()) {
            CorePlugin.getCorePlugin().getLogger()
                    .info("(DEBUG) [Core - Cosmetics (" + getCosmeticsPlatform() + ")] " + message);
        } else if(!debug) {
            CorePlugin.getCorePlugin().getLogger()
                    .info("[Core - Cosmetics (" + getCosmeticsPlatform() + ")] " + message);
        }
    }

    public String getCreateTableQuery(PiratesCosmeticsType type) {
        StringBuilder sb = new StringBuilder("CREATE TABLE IF NOT EXISTS `" + getTableName(type.getTableName()) + "`" +
                "(");
        sb.append(" `UUID` varchar(100) NOT NULL,");

        sb.append(" `active_id` INTEGER NOT NULL,");
        sb.append(" `purchased_ids` LONGTEXT NOT NULL,");

        sb.append(" UNIQUE KEY `UUID` (`UUID`)");
        sb.append(") ENGINE=InnoDB DEFAULT CHARSET=latin1;");

        return sb.toString();
    }
}