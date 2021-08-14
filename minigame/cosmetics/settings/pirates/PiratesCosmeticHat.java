package net.shawshark.core.plugin.minigame.cosmetics.settings.pirates;

import lombok.Getter;
import net.shawshark.core.plugin.minigame.cosmetics.settings.Cosmetic;

import java.util.Arrays;
import java.util.List;

public enum PiratesCosmeticHat implements Cosmetic {
    COSMONAUT(0, "glass", 200, 0, "&eCosmonaut"),
    WARRIOR(1, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTNlMzJhNmM0MTQ3ZGY0MGQwMjM4NTQ2ZDM2ZDVjMWVlYWZjMmVhOWNlYWMwMzUzZmNiODNiMGVlYTJkMmNmMSJ9fX0=", 600, 1, "&eWarrior"),
    DARK_MAGE(2, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODdmZDlkYjBjYThiY2I5NWJmYWI0NmZjM2VlYjYzMTBmNjUyZDRhMjY4ZjQ3ZGIxOWJjYTI3ZjY3NzM5YjM5MiJ9fX0=", 1000,2, "&eDark Mage"),
    CYBORG(3, "(eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTg2YWQ4ZjIzZTFlYjc5YWJkZDliOTMzZmIxY2ZjZDAyNDBjNTZlODIxMmRkYzNmZmExYTk2NTk4MzYifX19", 2000,3, "&eCyborg"),
    SCIENTIST(4, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjJiNDBiZmVkY2YwMjg1ZGJmZTc4YzY3ZGQ2Yjc2YzVhMjNjOTg3MGFhOGM4YjllOGJjMTQyZDA0NWMyYzA2NiJ9fX0=", 5000,4, "&eScientist"),
    SUPER_HERO(5, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2NmY2Y0Mzk2ODE0NzUxNDY1ODk0MzM4ZWUyZGNhYTA2YTI5ODJkOWRiZTg2MTM1Y2JmYmE5NTY3ODYzOGYifX19", 2500,5, "&eSuper Hero"),
    SCARED_VILLAGER(6, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTYzMzg2NTBjMTFmNDBjMTNiYTEzZjZmNzJjYzRmNmZjN2MzZGM0YWQ3NmU5ODUzN2ZjYjQ2ZmEyZDc5ZmUzYiJ9fX0=", 1200,6, "&eScared Villager"),
    MIKE(7, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOWYzMzMwMTNiNDdlNjRjZGU1YjE0NzEwNTk5NmRkYTNkMjNlZGY5MjhiZGZkZTdjMmY3OWYxNDdiM2U5Yzc5MSJ9fX0=", 1250,7, "&eMike"),
    MONSTER(8, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTI3NTU1YmI5Y2U0MWIxOTQ0M2FjZDc5ZjU5YjgyYWRlNGQ2ODNiZjc3NTgxZTZkM2IxNmY1MDJiZjU0ODY5In19fQ==", 1100,8, "&eMonster"),
    GOLEM(9, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmNlY2JhMzFmMjY5MTlkOTJhM2Q2NDIwY2QyZmE5MTEyZjhlMTA4YWMwNGUzZmM3MWRhNzMyOWNkMTBmZTVjYSJ9fX0=", 1500,9, "&eGolem"),
    PARROT(10, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTRiYThkNjZmZWNiMTk5MmU5NGI4Njg3ZDZhYjRhNTMyMGFiNzU5NGFjMTk0YTI2MTVlZDRkZjgxOGVkYmMzIn19fQ==", 750,10, "&eParrot"),
    BEE(11, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTg3NDc4N2UzNjE1OWU0ZDc0ZGI1ZTI1YmFiYTk4N2I2NjVkY2M4OTBiZTlmMjYyYmIwY2JjZjVkMDFiODJiNiJ9fX0=", 500,11, "&eBee"),
    ANGRY(12, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGZiOTdiMTdjNjM5NTM5MjY1OGYzMjcxOGFhNDZiZWZhMWMzMWQzNTcyNjUxYzMwZjdkMmJmM2I5M2Y2ZWFkOSJ9fX0=", 600,12, "&eAngry"),
    GLOBE(13, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjFkZDRmZTRhNDI5YWJkNjY1ZGZkYjNlMjEzMjFkNmVmYTZhNmI1ZTdiOTU2ZGI5YzVkNTljOWVmYWIyNSJ9fX0=", 1500,13, "&eGlobe"),
    POPCORN(14, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjFkZDRmZTRhNDI5YWJkNjY1ZGZkYjNlMjEzMjFkNmVmYTZhNmI1ZTdiOTU2ZGI5YzVkNTljOWVmYWIyNSJ9fX0=", 700,14, "&ePopcorn");

    @Getter private int id, slotID;
    @Getter private String texture, displayName;
    @Getter private int price;

    PiratesCosmeticHat(int id, String texture, int price, int slotID, String displayName) {
        this.id = id;
        this.texture = texture;
        this.price = price;
        this.slotID = slotID;
        this.displayName = displayName;
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
    public String getSkinValue() {
        return getTexture();
    }

    @Override
    public int slot() {
        return getSlotID();
    }

    @Override
    public PiratesCosmeticsType getType() {
        return PiratesCosmeticsType.HATS;
    }

    @Override
    public List<String> getUpdatedLore(PiratesCosmeticsPlayer playerSettings) {
        //current icon
        if(playerSettings.getActiveHatID() == getId()) {
            return Arrays.asList("", "&cAlready equipped");
        } else if(playerSettings.getPurchasedHats().contains(getId())) {
            return Arrays.asList("", "&aClick to select");
        } else {
            return Arrays.asList("", "&7Click to purchase");
        }
    }

    @Override
    public void addPurchase(PiratesCosmeticsPlayer playerSettings) {
        playerSettings.setActiveHatID(getId());
        playerSettings.getPurchasedHats().add(getId());
        playerSettings.getSettings().save(getType());
    }


}