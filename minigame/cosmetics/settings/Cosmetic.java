package net.shawshark.core.plugin.minigame.cosmetics.settings;

import net.shawshark.core.internal.PluginUtils;
import net.shawshark.core.plugin.database.MinigameCurrency;
import net.shawshark.core.plugin.minigame.MinigameTypes;
import net.shawshark.core.plugin.minigame.cosmetics.CosmeticPreviewType;
import net.shawshark.core.plugin.minigame.cosmetics.settings.pirates.PiratesCosmeticsPlayer;
import net.shawshark.core.plugin.minigame.cosmetics.settings.pirates.PiratesCosmeticsType;
import org.bukkit.Material;
import org.bukkit.entity.Player;

import java.util.List;

public interface Cosmetic {

    String getBaseName();

    int price();
    int id();
    String getDisplayName(boolean extra, String text);
    String getSkinValue();

    boolean isHeadIcon();
    String materialData();

    boolean hasPurchaseID(PiratesCosmeticsPlayer playerSettings, int id);
    int activeID(PiratesCosmeticsPlayer playerSettings);

    int[] getAvailableSlots(int index);

    boolean isPreviewCosmetic();
    CosmeticPreviewType getPreviewType();

    default Material getMaterial() {
        if(isHeadIcon()) return Material.GLASS;

        try {
            return Material.valueOf(materialData());
        } catch (IllegalArgumentException e) {
            return Material.GLASS;
        } catch (NullPointerException e) {
            return Material.GLASS;
        }
    }

    PiratesCosmeticsType getType();
    List<String> getUpdatedLore(PiratesCosmeticsPlayer playerSettings);

    void addPurchase(PiratesCosmeticsPlayer playerSettings);

    default void attemptPurchase(PiratesCosmeticsPlayer playerSettings, Player player, boolean closeMenu, MinigameTypes minigameType) {

        // player is attempting to purchase a cosmetic
        // they have got that equipped. just return here. DO nothing
        if (id() == activeID(playerSettings)) return;

        if (id() != -1) {
            if (closeMenu) {
                player.closeInventory();
            }
        }

        if (playerSettings.getSettings(getType()).getPurchased().contains(id())) {
            addPurchase(playerSettings);
            PluginUtils.sendMessage(player, "&2Cosmetics &f• &aYou have selected " + getDisplayName(false, "") + " &a" + getBaseName() + " Cosmetic!");
            return;
        } else if (id() == -1) {
            addPurchase(playerSettings);
            PluginUtils.sendMessage(player, "&2Cosmetics &f• &cYou have disabled your " + getBaseName() + " Cosmetic!");
            return;
        }

        if (price() > 0) {
            MinigameCurrency balance = playerSettings.getSettings().getCorePlayer().getBalances().get(minigameType);
            if (balance.getBalance() < price()) {
                PluginUtils.sendMessage(player, "&cYou don't have enough coins to purchase this cosmetic!");
                return;
            }

            balance.setBalance((balance.getBalance() - price()));
            playerSettings.getSettings().getCorePlayer().saveCurrency(minigameType, balance);
        }

        addPurchase(playerSettings);
        PluginUtils.sendMessage(player, "&2Cosmetics &f• &aYou have purchased " + getDisplayName(false, "") + " &a" + getBaseName() + " Cosmetic!");
    }
}
