package net.shawshark.core.plugin.minigame.cosmetics.settings;

import lombok.Getter;
import net.shawshark.core.internal.PluginUtils;
import net.shawshark.core.plugin.database.MinigameCurrency;
import net.shawshark.core.plugin.inventory.UpdateLoreListener;
import net.shawshark.core.plugin.minigame.MinigameTypes;
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

    int[] getAvailableSlots();

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
        if(id() == activeID(playerSettings)) return;

        if(price() > 0) {
            MinigameCurrency balance = playerSettings.getSettings().getCorePlayer().getBalances().get(minigameType);

            if(balance.getBalance() < price()) {
                if(closeMenu) {
                    player.closeInventory();
                }

                PluginUtils.sendMessage(player, "&cYou don't have enough coins to purchase this cosmetic!");
                return;
            }

            balance.setBalance((balance.getBalance() - price()));
            playerSettings.getSettings().getCorePlayer().saveCurrency(minigameType, balance);
        }

        addPurchase(playerSettings);

        if(id() != -1) {
            PluginUtils.sendMessage(player, "&aYou have purchased " + getDisplayName(false, "") + " &aCosmetic!");
        } else {
            PluginUtils.sendMessage(player, "&cYou have disabled your " + getBaseName() + " cosmetic!");
        }
    }
}
