package net.shawshark.core.plugin.minigame.cosmetics;

import com.google.common.base.Preconditions;
import net.shawshark.core.CorePlugin;
import net.shawshark.core.internal.InventoryUtils;
import net.shawshark.core.internal.ItemUtils;
import net.shawshark.core.internal.PluginUtils;
import net.shawshark.core.modules.AbstractModule;
import net.shawshark.core.plugin.database.DatabaseCache.DataCacheProfile;
import net.shawshark.core.plugin.inventory.*;
import net.shawshark.core.plugin.minigame.MinigameTypes;
import net.shawshark.core.plugin.minigame.cosmetics.settings.Cosmetic;
import net.shawshark.core.plugin.minigame.cosmetics.settings.pirates.PiratesCosmeticsPlayer;
import net.shawshark.core.plugin.minigame.cosmetics.settings.pirates.PiratesCosmeticsType;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.stream.Collectors;

public class CosmeticsManager extends AbstractModule {

    public CosmeticsManager(CorePlugin plugin) {
        super(plugin);
    }

    @Override
    protected void onEnable() {
        log(true, "init -> Cosmetics manager");
    }

    @Override
    protected void onDisable() {
    }

    @Override
    protected int getReloadDelay() {
        return 0;
    }

    @Override
    protected int getInitialLoadDelay() {
        return 0;
    }

    public void inputBorder(int rows, Material item, ChestGUI gui) {
        for(int borderID : InventoryUtils.getBorders((rows*9))) {
            gui.setIcon(borderID, new Icon(ItemUtils.createItem(" ", 1, item, null)));
        }
    }

    public void openPiratesCosmetics(Player player, PiratesCosmeticsPlayer piratesSettings) {
        Preconditions.checkNotNull(piratesSettings, "piratesSettings cannot be null (" + player.getName() + ")");
        ChestGUIPages gui = new ChestGUIPages();

        ChestGUI main = new ChestGUI("&9Pirates Cosmetics",6);
        inputBorder(6, Material.GRAY_STAINED_GLASS_PANE, main);

        Icon close = new Icon(ItemUtils.createItem("&cClose", 1, Material.BARRIER, null));
        close.addClickAction((player1, clickType) -> player1.closeInventory());
        main.setIcon(((6*9) - 1), close);

        for(PiratesCosmeticsType menuData : PiratesCosmeticsType.values()) {
            ChestGUI cosmetic = new ChestGUI(menuData.getDisplayName(), 6);
            inputBorder(6, Material.GRAY_STAINED_GLASS_PANE, cosmetic);

            Cosmetic[] c = menuData.getCosmetic();
            int id = 0;
            for(Cosmetic cos : c) {
                int[] availableSlots = cos.getAvailableSlots();
                String displayName;
                if(cos.hasPurchaseID(piratesSettings, cos.id())) {
                    displayName = cos.getDisplayName(false, "");
                } else {
                    if(cos.id() != -1) {
                        displayName = cos.getDisplayName(false, "") + " &7- &e" + cos.price() + " Coins";
                    } else {
                        displayName = cos.getDisplayName(false, ""); // don't show coins for the disable icon
                    }
                }

                ItemStack item;
                if(cos.isHeadIcon()) {
                    DataCacheProfile profile = new DataCacheProfile(cos.getSkinValue());
                    item = ItemUtils.getPlayerHead(profile, displayName, null);
                } else {
                    item = ItemUtils.createItem(displayName,1, cos.getMaterial(), null);
                }

                Icon icon = new Icon(item);
                icon.addClickAction((player12, clickType) -> {
                    cos.attemptPurchase(piratesSettings, player, true, MinigameTypes.PIRATES);
                });
                icon.setUpdateLoreListener(() -> cos.getUpdatedLore(piratesSettings)
                        .stream()
                        .map(PluginUtils::format)
                        .collect(Collectors.toList()));
                cosmetic.setIcon(availableSlots[id++], icon); // always plus (+1) as disabled item is -1
            }

            // usually 45 (far bottom left corner
            Icon back = new Icon(ItemUtils.createItem("&7Go Back", 1, Material.ARROW, null));
            back.addClickAction((player1, clickType) -> gui.open(0, player));
            cosmetic.setIcon(45, back);

            gui.addPage(cosmetic, menuData.getId());

            Icon mainButton;
            if(menuData.isBase64Head()) {
                DataCacheProfile profile = new DataCacheProfile(menuData.getBase64HeadData());
                mainButton = new Icon(ItemUtils.getPlayerHead(profile, menuData.getDisplayName(), null));
            } else {
                mainButton = new Icon(ItemUtils.createItem(menuData.getDisplayName(), 1, menuData.getMaterial(), null));
            }
            mainButton.addClickAction((player1, clickType) -> gui.open(menuData.getId(), player));
            main.setIcon(menuData.getSlotID(), mainButton);
        }

        gui.addPage(main, 0);
        gui.open(0, player);
    }
}