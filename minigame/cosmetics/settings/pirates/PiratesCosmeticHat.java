package net.shawshark.core.plugin.minigame.cosmetics.settings.pirates;

import lombok.Getter;
import net.shawshark.core.plugin.minigame.cosmetics.CosmeticPreviewType;
import net.shawshark.core.plugin.minigame.cosmetics.settings.Cosmetic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum PiratesCosmeticHat implements Cosmetic {

    DISABLE(-1, "item:BARRIER", 0, "&cNone &8(Default)"),
    COSMONAUT(0, "item:GLASS", 200, "&9Cosmonaut"),
    WARRIOR(1, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTNlMzJhNmM0MTQ3ZGY0MGQwMjM4NTQ2ZDM2ZDVjMWVlYWZjMmVhOWNlYWMwMzUzZmNiODNiMGVlYTJkMmNmMSJ9fX0=", 600, "&6Warrior"),
    DARK_MAGE(2, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODdmZDlkYjBjYThiY2I5NWJmYWI0NmZjM2VlYjYzMTBmNjUyZDRhMjY4ZjQ3ZGIxOWJjYTI3ZjY3NzM5YjM5MiJ9fX0=", 1000, "&8Dark Mage"),
    //CYBORG(3, "(eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTg2YWQ4ZjIzZTFlYjc5YWJkZDliOTMzZmIxY2ZjZDAyNDBjNTZlODIxMmRkYzNmZmExYTk2NTk4MzYifX19", 2000, "&eCyborg"),
    SCIENTIST(4, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjJiNDBiZmVkY2YwMjg1ZGJmZTc4YzY3ZGQ2Yjc2YzVhMjNjOTg3MGFhOGM4YjllOGJjMTQyZDA0NWMyYzA2NiJ9fX0=", 5000, "&1Scientist"),
    SUPER_HERO(5, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2NmY2Y0Mzk2ODE0NzUxNDY1ODk0MzM4ZWUyZGNhYTA2YTI5ODJkOWRiZTg2MTM1Y2JmYmE5NTY3ODYzOGYifX19", 2500, "&bSuper Hero"),
    SCARED_VILLAGER(6, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTYzMzg2NTBjMTFmNDBjMTNiYTEzZjZmNzJjYzRmNmZjN2MzZGM0YWQ3NmU5ODUzN2ZjYjQ2ZmEyZDc5ZmUzYiJ9fX0=", 1200, "&3Scared Villager"),
    MIKE(7, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOWYzMzMwMTNiNDdlNjRjZGU1YjE0NzEwNTk5NmRkYTNkMjNlZGY5MjhiZGZkZTdjMmY3OWYxNDdiM2U5Yzc5MSJ9fX0=", 1250, "&aMike"),
    MONSTER(8, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTI3NTU1YmI5Y2U0MWIxOTQ0M2FjZDc5ZjU5YjgyYWRlNGQ2ODNiZjc3NTgxZTZkM2IxNmY1MDJiZjU0ODY5In19fQ==", 1100, "&2Monster"),
    GOLEM(9, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmNlY2JhMzFmMjY5MTlkOTJhM2Q2NDIwY2QyZmE5MTEyZjhlMTA4YWMwNGUzZmM3MWRhNzMyOWNkMTBmZTVjYSJ9fX0=", 1500, "&fGolem"),
    PARROT(10, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTRiYThkNjZmZWNiMTk5MmU5NGI4Njg3ZDZhYjRhNTMyMGFiNzU5NGFjMTk0YTI2MTVlZDRkZjgxOGVkYmMzIn19fQ==", 750, "&eParrot"),
    BEE(11, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTg3NDc4N2UzNjE1OWU0ZDc0ZGI1ZTI1YmFiYTk4N2I2NjVkY2M4OTBiZTlmMjYyYmIwY2JjZjVkMDFiODJiNiJ9fX0=", 500, "&6Bee"),
    ANGRY(12, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGZiOTdiMTdjNjM5NTM5MjY1OGYzMjcxOGFhNDZiZWZhMWMzMWQzNTcyNjUxYzMwZjdkMmJmM2I5M2Y2ZWFkOSJ9fX0=", 600, "&4Angry"),
    GLOBE(13, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjFkZDRmZTRhNDI5YWJkNjY1ZGZkYjNlMjEzMjFkNmVmYTZhNmI1ZTdiOTU2ZGI5YzVkNTljOWVmYWIyNSJ9fX0=", 1500, "&3Globe"),
    POPCORN(14, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWViZjRiZDhkMjE2OWYxMDI3MzhiZmUyYmY3Y2ZlZDY5NTc3YjdjZjY3MjFhZmI3YTYyNGE4NTcwM2JiZDRiIn19fQ==", 700, "&dPopcorn"),
    BURGER(15, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTZkOWQ2ZDFmMDE1ZjEyYzI4Yjg1MjUzN2NkNzQ2MzUzMzNkNTI5MWZmYmY5Y2I3ZTQ0NDI1YTU0MDQ1YjMwNSJ9fX0=", 900, "&6Burger"),
    SKULL(16, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOWFiNWUyMmRiZDRhZTRkMWJhMTliZTk3ZTkwMTYzNGY2NmI5NmQwYTkyZTI3MDM1MDhhZmQ3YmE4MGY5MzgyMiJ9fX0=", 2000, "&5Skull"),
    CAKE(17, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTI3OTI0ZDM5MjBkZDU3NDYxZTk5NDU3ZjIyNjFmMDI5ZWNlOGQzNTE2OWM3Zjc1NDU0ZmJjMmYxOGYxYmQ3OCJ9fX0=", 800, "&bCake"),
    LOBSTER(18, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjY4YTVhZTJhYTNlZjMzM2U2YWE2NTMzYjMzMTM5NjAzOGQ3NTM3YTc0MDhhMmM1NjRjMTZmMDNlNWY4OCJ9fX0=", 1250, "&4Lobster"),
    CHEESE(19, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTU1ZDYxMWE4NzhlODIxMjMxNzQ5YjI5NjU3MDhjYWQ5NDI2NTA2NzJkYjA5ZTI2ODQ3YTg4ZTJmYWMyOTQ2In19fQ==", 950, "&eCheese");

    @Getter private int id;
    @Getter private String texture, displayName;
    @Getter private int price;

    PiratesCosmeticHat(int id, String texture, int price, String displayName) {
        this.id = id;
        this.texture = texture;
        this.price = price;
        this.displayName = displayName;
    }

    @Override
    public String getBaseName() {
        return "Hat";
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
        return getDisplayName() + (extra ? text : "");
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
        PiratesCosmeticsPlayer.Settings settings = playerSettings.getSettings(getType());
        return settings.getPurchased().contains(id);
    }

    @Override
    public int activeID(PiratesCosmeticsPlayer playerSettings) {
        PiratesCosmeticsPlayer.Settings settings = playerSettings.getSettings(getType());
        return settings.getActiveID();
    }

    @Override
    public int[] getAvailableSlots(int index) {
        int array[] = new int[]{11, 12, 13, 14, 15, 20, 21, 22, 23, 24, 29, 30, 31, 32, 33, 38, 39, 40, 41, 42};
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
        return PiratesCosmeticsType.HATS;
    }

    @Override
    public List<String> getUpdatedLore(PiratesCosmeticsPlayer playerSettings) {

        PiratesCosmeticsPlayer.Settings settings = playerSettings.getSettings(getType());
/*
        if(this == DISABLE && settings.getActiveID() != -1 || settings.getPurchased().contains(getId())) {
            return Arrays.asList("", "&aClick to select");
        } else if(this == DISABLE && settings.getActiveID() == -1 || settings.getActiveID() == getId()) {
            return Arrays.asList("", "&cAlready equipped");
        } else {
            return Arrays.asList("", "&7Click to purchase");
        }*/

        if(getId() == settings.getActiveID()) {
            return Arrays.asList("", "&cAlready equipped");
        } else if(this == DISABLE || settings.getPurchased().contains(getId())) {
            return Arrays.asList("", "&aClick to select");
        } else {
            return Arrays.asList("", "&7Click to purchase");
        }
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