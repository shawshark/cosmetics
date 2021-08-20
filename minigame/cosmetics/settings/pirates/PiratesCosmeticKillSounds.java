package net.shawshark.core.plugin.minigame.cosmetics.settings.pirates;

import lombok.Getter;
import net.shawshark.core.plugin.minigame.cosmetics.CosmeticPreviewType;
import net.shawshark.core.plugin.minigame.cosmetics.CosmeticSound;
import net.shawshark.core.plugin.minigame.cosmetics.settings.Cosmetic;
import org.bukkit.Sound;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum PiratesCosmeticKillSounds implements Cosmetic, CosmeticSound {

    DISABLE(-1, "item:BARRIER", 0, "&cNone", null),
    BLAZE(0, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjc4ZWYyZTRjZjJjNDFhMmQxNGJmZGU5Y2FmZjEwMjE5ZjViMWJmNWIzNWE0OWViNTFjNjQ2Nzg4MmNiNWYwIn19fQ==", 2000, "&6Blaze", Sound.ENTITY_BLAZE_DEATH),
    ENDERMAN(1, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTZjMGIzNmQ1M2ZmZjY5YTQ5YzdkNmYzOTMyZjJiMGZlOTQ4ZTAzMjIyNmQ1ZTgwNDVlYzU4NDA4YTM2ZTk1MSJ9fX0=", 3000, "&5Enderman", Sound.ENTITY_ENDERMAN_DEATH),
    PIG(2, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjIxNjY4ZWY3Y2I3OWRkOWMyMmNlM2QxZjNmNGNiNmUyNTU5ODkzYjZkZjRhNDY5NTE0ZTY2N2MxNmFhNCJ9fX0=", 600, "&dPig", Sound.ENTITY_PIG_DEATH),
    COW(3, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2RmYTBhYzM3YmFiYTJhYTI5MGU0ZmFlZTQxOWE2MTNjZDYxMTdmYTU2OGU3MDlkOTAzNzQ3NTNjMDMyZGNiMCJ9fX0=", 500, "&3Cow", Sound.ENTITY_COW_DEATH),
    CHICKEN(4, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMWQxN2U0OGM5MjUzZTY3NDczM2NlYjdiYzNkYTdmNTIxNTFlNTI4OWQwMjEyYzhmMmRkNzFlNDE2ZTRlZTY1In19fQ==", 500, "&fChicken", Sound.ENTITY_CHICKEN_DEATH),
    SPIDER(5, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzg3YTk2YThjMjNiODNiMzJhNzNkZjA1MWY2Yjg0YzJlZjI0ZDI1YmE0MTkwZGJlNzRmMTExMzg2MjliNWFlZiJ9fX0=", 850, "&4Spider", Sound.ENTITY_SPIDER_DEATH),
    SILVERFISH(6, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTJlYzJjM2NiOTVhYjc3ZjdhNjBmYjRkMTYwYmNlZDRiODc5MzI5YjYyNjYzZDdhOTg2MDY0MmU1ODhhYjIxMCJ9fX0=", 750, "&3Silverfish", Sound.ENTITY_SILVERFISH_DEATH),
    SHEARS(7, "item:SHEARS", 750, "&fShears", Sound.ENTITY_SHEEP_SHEAR),
    WANNA_TRADE(8, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDA1N2UzYzQzZGNjZjZmYzVlZDEzZTE5ZmEzODBiZGE2ODdhYWE2ODc3OWNiZjhlZDRjNTY1NmU3MGU0NTY3OCJ9fX0=", 1500, "&aWanna trade?", Sound.ENTITY_VILLAGER_TRADE),
    SKELETON(9, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzAxMjY4ZTljNDkyZGExZjBkODgyNzFjYjQ5MmE0YjMwMjM5NWY1MTVhN2JiZjc3ZjRhMjBiOTVmYzAyZWIyIn19fQ==", 1000, "&bSkeleton", Sound.ENTITY_SKELETON_DEATH),
    EGG(10, "item:EGG", 250, "&eEgg", Sound.ENTITY_CHICKEN_EGG);

    @Getter private int id, price;
    @Getter private String texture, displayName;
    private Sound sound;

    PiratesCosmeticKillSounds(int id, String texture, int price, String displayName, Sound sound) {
        this.id = id;
        this.texture = texture;
        this.price = price;
        this.displayName = displayName;
        this.sound = sound;
    }

    @Override
    public String getBaseName() {
        return "Kill Sound";
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
        return getDisplayName() + (this == DISABLE ? " &8(Free)" : "") + (extra ? text : "");
    }

    @Override
    public String getSkinValue() {
        return getTexture();
    }

    @Override
    public boolean isHeadIcon() {
        return (!getTexture().startsWith("item:"));
    }

    @Override
    public String materialData() {
        return getTexture().split("item:")[1];
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
        int array[] = new int[]{13, 20, 21,22,23,24,29,30,31,32,33,40};
        return array;
    }

    @Override
    public boolean isPreviewCosmetic() {
        return true;
    }

    @Override
    public CosmeticPreviewType getPreviewType() {
        return CosmeticPreviewType.SOUND;
    }

    @Override
    public PiratesCosmeticsType getType() {
        return PiratesCosmeticsType.KILL_SOUNDS;
    }

    @Override
    public List<String> getUpdatedLore(PiratesCosmeticsPlayer playerSettings) {
        PiratesCosmeticsPlayer.Settings settings = playerSettings.getSettings(getType());

        List<String> lore = new ArrayList<>();
        lore.add("");
/*
        if(this == DISABLE && settings.getActiveID() != -1 || settings.getPurchased().contains(getId())) {
            //return Arrays.asList("", "&aClick to select");
            lore.add("&a" + (id != -1 ? "Left-click " : "Click ") + "to select");
        } else if(this == DISABLE && settings.getActiveID() == -1 || settings.getActiveID() == getId()) {
            //return Arrays.asList("", "&cAlready equipped");
            lore.add("&cAlready equipped");
        } else {
            //return Arrays.asList("", "&7Click to purchase");
            lore.add("&7" + (id != -1 ? "Left-click " : "Click ") + "to purchase");
        }*/

        if(id != -1) {
            lore.add("&7Right-click to preview sound");
        }

        if(getId() == settings.getActiveID()) {
            //return Arrays.asList("", "&cAlready equipped");
            lore.add("&cAlready equipped");
        } else if(this == DISABLE || settings.getPurchased().contains(getId())) {
            //return Arrays.asList("", "&aClick to select");
            lore.add("&aLeft-click to select");
        } else {
            //return Arrays.asList("", "&7Click to purchase");
            lore.add("&aLeft-click to purchase");
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

    @Override
    public Sound getSound() {
        return this.sound;
    }
}
