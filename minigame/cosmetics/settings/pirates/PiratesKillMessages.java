package net.shawshark.core.plugin.minigame.cosmetics.settings.pirates;

import lombok.Getter;
import net.shawshark.core.plugin.minigame.cosmetics.CosmeticPreviewType;
import net.shawshark.core.plugin.minigame.cosmetics.settings.Cosmetic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum PiratesKillMessages  implements Cosmetic {

    DEFAULT(-1, "&cDefault", "&6(Player) &fwas killed by &c(Killer)", 0),
    GOOD_CARE(0, "&dGood Care", "&6(Player) &fwas taken care of by &c(Killer)", 2000),
    SMASH(1, "&2Smash", "&c(Killer) &fsmashed &6(Player) &finto ground", 1500),
    BEATING(2, "&4Beating", "&c(Killer) &fbeated the life out of &6(Player)", 1000),
    TASTY_SNACK(3, "&6Tasty Snack", "&6(Player) &fwas bitten by &c(Killer)", 3000),
    KILLER_GAZE(4, "&5Killer Gaze", "&c(Killer) &fwas looking at &6(Player) &funtil he died", 3500),
    BAITED_LIKE_A_FISH(5, "&3Baited like a Fish", "&6(Player) &fgot baited by &c(Killer)", 2500),
    OUT_SMARTED(6, "&aOutsmarted", "&c(Killer) &foutsmarted &6(Player) &fand killed him", 5000),
    HARD_TIMES(7, "&4Hard Times", "&6(Player) &fdied trying to kill &c(Killer)", 1000),
    SOCIAL_INTERACTION(8, "&fSocial Interaction", "&6(Player) &fdidn't survive interaction with &c(Killer)", 1500),
    BETTER_STAY_HOME(9, "&9Better stay Home", "&6(Player) &fmet &c(Killer) &fand died", 4500),
    THE_STRONGEST(10, "&cThe Strongest", "&6(Player) &fwas killed by &c(Killer)&f's amazing powers", 4000),
    CONFUSED(11, "&eConfused?", "&6(Player) &fgot bamboozled by &c(Killer)", 2000),
    NICE_TRY(12, "&dNice Try", "&6(Player) &ffought &c(Killer) &fand lost", 700),
    LOSERS_TAKE_THE_LS(13, "&1Losers take the L's", "&6(Player) &ftook the L's from &c(Killer)", 5000);


    @Getter private int id, price;
    @Getter private String displayName, message;

    PiratesKillMessages(int id, String displyName, String message, int price) {
        this.id = id;
        this.displayName = displyName;
        this.message = message;
        this.price = price;
    }

    @Override
    public String getBaseName() {
        return "Kill Message";
    }

    @Override
    public int price() {
        return getPrice();
    }

    @Override
    public int id() {
        return getId();
    }

    @Override
    public String getDisplayName(boolean extra, String text) {
        return getDisplayName() + (this == DEFAULT ? " &8(Free)" : "") + (extra ? text : "");
    }

    @Override
    public String getSkinValue() {
        return null;
    }

    @Override
    public boolean isHeadIcon() {
        return false;
    }

    @Override
    public String materialData() {
        if(this == DEFAULT) {
            return "BARRIER";
        } else {
            return "PAPER";
        }
    }

    @Override
    public boolean hasPurchaseID(PiratesCosmeticsPlayer playerSettings, int id) {
        return playerSettings.getSettings(getType()).getPurchased().contains(id);
    }

    @Override
    public int activeID(PiratesCosmeticsPlayer playerSettings) {
        return playerSettings.getSettings(getType()).getActiveID();
    }

    @Override
    public int[] getAvailableSlots(int index) {
        int array[] = new int[]{13, 19, 20, 21, 22, 23, 24,25,28,29,30,31,32,33,34};
        return array;
    }

    @Override
    public boolean isPreviewCosmetic() {
        return false;
    }

    @Override
    public CosmeticPreviewType getPreviewType() {
        return CosmeticPreviewType.NONE;
    }

    @Override
    public PiratesCosmeticsType getType() {
        return PiratesCosmeticsType.KILL_MESSAGES;
    }

    @Override
    public List<String> getUpdatedLore(PiratesCosmeticsPlayer playerSettings) {
        PiratesCosmeticsPlayer.Settings settings = playerSettings.getSettings(getType());

        List<String> lore = new ArrayList<>();
        lore.add(" ");
        lore.add("&8--");
        lore.add(getMessage());
        lore.add("&8--");
        lore.add(" ");

        /*
        if(this == DEFAULT && settings.getActiveID() != -1 || settings.getPurchased().contains(getId())) {
            //return Arrays.asList("", );
            lore.add("&aClick to select");
        } else if(this == DEFAULT && settings.getActiveID() == -1 || settings.getActiveID() == getId()) {
            //return Arrays.asList("", );
            lore.add("&cAlready equipped");
        } else {
            //return Arrays.asList("", );
            lore.add("&7Click to purchase");
        }*/

        if(getId() == settings.getActiveID()) {
            //return Arrays.asList("", "&cAlready equipped");
            lore.add("&cAlready equipped");
        } else if(this == DEFAULT || settings.getPurchased().contains(getId())) {
            //return Arrays.asList("", "&aClick to select");
            lore.add("&aClick to select");
        } else {
            //return Arrays.asList("", "&7Click to purchase");
            lore.add("&7Click to purchase");
        }

        return lore;
    }

    @Override
    public void addPurchase(PiratesCosmeticsPlayer playerSettings) {
        PiratesCosmeticsPlayer.Settings settings = playerSettings.getSettings(getType());
        settings.setActiveID(getId());
        //playerSettings.setActiveHatID(getId());
        if(getId() != -1) {
            settings.getPurchased().add(getId());
            //playerSettings.getPurchasedHats().add(getId());
        }
        playerSettings.getSettings().save(getType());
    }
}
