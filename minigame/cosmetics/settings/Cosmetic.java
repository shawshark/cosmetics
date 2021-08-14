package net.shawshark.core.plugin.minigame.cosmetics.settings;

import lombok.Getter;
import net.shawshark.core.internal.PluginUtils;
import net.shawshark.core.plugin.database.MinigameCurrency;
import net.shawshark.core.plugin.inventory.UpdateLoreListener;
import net.shawshark.core.plugin.minigame.MinigameTypes;
import net.shawshark.core.plugin.minigame.cosmetics.settings.pirates.PiratesCosmeticsPlayer;
import net.shawshark.core.plugin.minigame.cosmetics.settings.pirates.PiratesCosmeticsType;
import org.bukkit.entity.Player;

import java.util.List;

public interface Cosmetic {

    int price();
    int id();
    String getDisplayName();
    String getSkinValue();
    int slot();

    PiratesCosmeticsType getType();
    List<String> getUpdatedLore(PiratesCosmeticsPlayer playerSettings);

    void addPurchase(PiratesCosmeticsPlayer playerSettings);

    default void attemptPurchase(PiratesCosmeticsPlayer playerSettings, Player player, boolean closeMenu, MinigameTypes minigameType) {

        MinigameCurrency balance = playerSettings.getSettings().getCorePlayer().getBalances().get(minigameType);

        if(balance.getBalance() < price()) {
            if(closeMenu) {
                player.closeInventory();
            }

            PluginUtils.sendMessage(player, "&cYou don't have enough coins to purchase this cosmetic!");
            return;
        }

        balance.setBalance((balance.getBalance() - price()));
        playerSettings.getSettings().getCorePlayer().saveCurrency(MinigameTypes.PIRATES, balance);

        addPurchase(playerSettings);

        PluginUtils.sendMessage(player, "&aYou have purchased " + getDisplayName() + " &aCosmetic!");
    }

}
