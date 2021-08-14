package net.shawshark.core.plugin.minigame.cosmetics.settings.pirates;

import lombok.Getter;
import net.shawshark.core.plugin.minigame.cosmetics.settings.Cosmetic;

import java.util.Arrays;
import java.util.List;

public enum PiratesCosmeticBalloons implements Cosmetic {

    DEFAULT(-1, "item:BARRIER", 0, "&cNone &8(Default)"),
    BOMB(0, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGRhMzMyYWJkZTMzM2ExNWE2YzZmY2ZlY2E4M2YwMTU5ZWE5NGI2OGU4ZjI3NGJhZmMwNDg5MmI2ZGJmYyJ9fX0=",1100, "&8Bomb"),
    GOLDEN_SKULL(1, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjc4ODNlYTQ4MDlhZjc0NWM5N2NhNzdlNzA0NDg1NDk4OTA1MTk4ZDZhZTI4MTM4YWRiZDRjNWQ0YjgxYjk0NCJ9fX0=", 2500, "&eGolden Skull"),
    EYE(2, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTZjMjIyMTUwNmRiMjA1MTc2MjcyZDQ4ZDgyNzVkOGRlYzE3NTc3YmMyMTE5ODM5OGE5ZTUxNTlhMDc0MzQifX19", 2500, "&4Eye"),
    LOVE(3, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmM4ZmI2MzdkNmUxYTdiYThmYTk3ZWU5ZDI5MTVlODQzZThlYzc5MGQ4YjdiZjYwNDhiZTYyMWVlNGQ1OWZiYSJ9fX0=", 750, "&cLove"),
    LOOT_CHEST(4, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjUyMmVjNTcwOWVkOWQ1ZDE2MjRjNjc5ZThkM2UxNmM3ZjdjZmJiZGI3OGY4OTAzNjFiZjFmMmFhMDRiODNmNSJ9fX0=", 900, "&6Loot Chest"),
    PIGGY_BANK(5, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTk4ZGY0MmY0NzdmMjEzZmY1ZTlkN2ZhNWE0Y2M0YTY5ZjIwZDljZWYyYjkwYzRhZTRmMjliZDE3Mjg3YjUifX19", 900, "&dPiggy Bank"),
    CAT(6, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWJjMWE4M2VjYTM3MjQ5YTI4ZTQyN2M1NDE1NTZlNzhkNDBiOTI4ZWE5ZTE1NjlkNGU2ZDVmYWM4NDQ4ODgifX19", 666, "&3Cat"),
    DRAGON(7, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTJmOWU5N2Y0YmU1MzM2MzRiZDFiM2UzNjc5ZWRlYmZmZmI5ODQwMTNhMWQ1OTAyZmEzYzM1ZDM0MzViYzEwIn19fQ==", 3000, "&5Dragon"),
    GLOBE(8, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjFkZDRmZTRhNDI5YWJkNjY1ZGZkYjNlMjEzMjFkNmVmYTZhNmI1ZTdiOTU2ZGI5YzVkNTljOWVmYWIyNSJ9fX0=", 800, "&9Globe"),
    BURGER(9, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNWZiNDhlMmI5NjljNGMxYjg2YzVmODJhMmUyMzc5OWY0YTZmMzFjZTAwOWE1ZjkyYjM5ZjViMjUwNTdiMmRkMCJ9fX0=", 900, "&cBurger"),
    DIAMOND_SKULL(10, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDVkZDUyNTA1MDVhYWUyMmVmZGVlYmU5NDdhMzUwZWI3N2JjODFhZjQ2MDFlYTViYTg5YjZlNGQ1MDBlYjUwIn19fQ==", 2500, "&bDiamond Skull"),
    CAMERA(11, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmZiNWVlZTQwYzNkZDY2ODNjZWM4ZGQxYzZjM2ZjMWIxZjAxMzcxNzg2NjNkNzYxMDljZmUxMmVkN2JmMjc4ZSJ9fX0=", 1250, "&8Camera"),
    DRINK(12, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmJlOTUwNWEzOGExNGQxNTEyYzc4OTJmYzQ0ZDNkN2NlNjMzOGIxYmYwZjkxMjM3MjFiMTIxYTE0YjA5NWEzIn19fQ==", 550, "&fDrink"),
    CUTE_STEVE(13, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmM4MTk5MTFiOTQzM2ViYWZjY2MyZGVjMTg5NDQ0NDE1YWYwNmYzNGYwYjkwOGExMDRjNjVjM2E3Njc4MmI4MCJ9fX0=", 700, "&aCute Steve"),
    MAFIA_BOSS(14, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWNlYTcwYjU2YWEzMzA0NWY1MzcyZWY5ZjEyMDE1NDczOTcxYzAyZTcyMzI5NzcwZTFlOTQ3NzM4NzI5OTRiNSJ9fX0=", 2500, "&4Mafia Boss"),
    DOGE(15, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTM5ZTQzZGI4M2E5NjZjNWI2ZjZjMDNhMTdkN2M2ZGE0YmExYjYyMmU2N2MyOGNlNjAxNzYwNzY4OWY2ZTIzMiJ9fX0=", 950, "&6Doge");

    @Getter private int id, price;
    @Getter private String texture, displayName;

    PiratesCosmeticBalloons(int id, String texture, int price, String displayName) {
        this.id = id;
        this.texture = texture;
        this.price = price;
        this.displayName = displayName;
    }

    @Override
    public String getBaseName() {
        return null;
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
    public int[] getAvailableSlots() {
        int array[] = new int[]{11, 12, 13, 14, 20, 21, 22, 23, 24, 29, 30, 31, 32, 33, 39, 40, 41};
        return array;
    }

    @Override
    public PiratesCosmeticsType getType() {
        return PiratesCosmeticsType.BALLOONS;
    }

    @Override
    public List<String> getUpdatedLore(PiratesCosmeticsPlayer playerSettings) {
        PiratesCosmeticsPlayer.Settings settings = playerSettings.getSettings(getType());

        if(this == DEFAULT && settings.getActiveID() != -1 || settings.getPurchased().contains(getId())) {
            return Arrays.asList("", "&aClick to select");
        } else if(this == DEFAULT && settings.getActiveID() == -1 || settings.getActiveID() == getId()) {
            return Arrays.asList("", "&cAlready equipped");
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
