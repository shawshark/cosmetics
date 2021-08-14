package net.shawshark.core.plugin.minigame.cosmetics;

import com.google.common.base.Preconditions;
import net.shawshark.core.CorePlugin;
import net.shawshark.core.internal.InventoryUtils;
import net.shawshark.core.internal.ItemUtils;
import net.shawshark.core.modules.AbstractModule;
import net.shawshark.core.plugin.database.DatabaseCache.DataCacheProfile;
import net.shawshark.core.plugin.inventory.*;
import net.shawshark.core.plugin.minigame.MinigameTypes;
import net.shawshark.core.plugin.minigame.cosmetics.settings.Cosmetic;
import net.shawshark.core.plugin.minigame.cosmetics.settings.pirates.PiratesCosmeticHat;
import net.shawshark.core.plugin.minigame.cosmetics.settings.pirates.PiratesCosmeticsPlayer;
import net.shawshark.core.plugin.minigame.cosmetics.settings.pirates.PiratesCosmeticsType;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;

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

    public void openPiratesCosmetics(Player player, PiratesCosmeticsPlayer piratesSettings) {
        Preconditions.checkNotNull(piratesSettings, "piratesSettings cannot be null (" + player.getName() + ")");

        ChestGUIPages gui = new ChestGUIPages();

        ChestGUI main = new ChestGUI("&9Pirates Cosmetics",6);

        for(int borderID : InventoryUtils.getBorders((6*9))) {
            main.setIcon(borderID, new Icon(ItemUtils.createItem("", 1,Material.BLACK_STAINED_GLASS_PANE, null)));
        }
        Icon close = new Icon(ItemUtils.createItem("&cClose", 1, Material.BARRIER, null));
        close.addClickAction((player1, clickType) -> player1.closeInventory());
        main.setIcon(((6*9) - 1), close);

        for(PiratesCosmeticsType menuData : PiratesCosmeticsType.values()) {
            ChestGUI cosmetic = new ChestGUI(menuData.getDisplayName(), (6*9));

            Cosmetic[] c = (Cosmetic[]) menuData.getCosmetic();

            for(Cosmetic cos : c) {

                DataCacheProfile profile = new DataCacheProfile(cos.getSkinValue());
                ItemStack item = ItemUtils.getPlayerHead(profile, cos.getDisplayName(), null);

                Icon icon = new Icon(item);
                icon.addClickAction((player12, clickType) -> {
                    cos.attemptPurchase(piratesSettings, player, true, MinigameTypes.PIRATES);
                });
                icon.setUpdateLoreListener(() -> cos.getUpdatedLore(piratesSettings));
                cosmetic.setIcon(cos.slot(), icon);
            }

            Icon back = new Icon(ItemUtils.createItem("&7Go Back", 1, Material.ARROW, null));
            back.addClickAction((player1, clickType) -> gui.open(0, player));
            cosmetic.setIcon((6*9)-1, back);

            gui.addPage(cosmetic, menuData.getId());

            Icon mainButton = new Icon(ItemUtils.createItem(menuData.getDisplayName(), 1, menuData.getMaterial(), null));
            mainButton.addClickAction((player1, clickType) -> gui.open(menuData.getId(), player));
            main.setIcon(menuData.getSlotID(), mainButton);
        }

        gui.addPage(main, 0);
        gui.open(0, player);
    }
}
