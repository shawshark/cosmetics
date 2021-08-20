package net.shawshark.core.plugin.minigame.cosmetics.settings.pirates;

import lombok.Getter;
import net.shawshark.core.plugin.minigame.cosmetics.CosmeticPreviewType;
import net.shawshark.core.plugin.minigame.cosmetics.settings.Cosmetic;

import java.util.Arrays;
import java.util.List;

public enum PiratesCosmeticKillParticles implements Cosmetic {

    DISABLE(-1, "item:BARRIER", 0, "&cNone"),
    ANGRY_VILLAGER(0, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODhlOTVkYzU3NmI5ZTRlNWUwZDcwZDY0MDUzZjQ2ZTBiMzJhNTE3NmQ1ODcyYmQ3ZDYwODEwYTNjM2ExODRhYSJ9fX0=", 500, "&2Angry Villager"),
    EFFECT(1, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTUyNzAxYzY4NzFiYWUwM2MxYzM3NzA1ZDQzNDlmZTA4OGNhOTcwOWJmZGUwN2NhMGYyNzMwNDY5Y2I0ZTQifX19", 400, "&dEffect"),
    HEART(2, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmM4ZmI2MzdkNmUxYTdiYThmYTk3ZWU5ZDI5MTVlODQzZThlYzc5MGQ4YjdiZjYwNDhiZTYyMWVlNGQ1OWZiYSJ9fX0=", 1000, "&cHeart"),
    SNEEZE(3, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODQyNDc4MGIzYzVjNTM1MWNmNDlmYjViZjQxZmNiMjg5NDkxZGY2YzQzMDY4M2M4NGQ3ODQ2MTg4ZGI0Zjg0ZCJ9fX0=", 250, "&aSneeze"),
    WITCH(4, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjk1MDJhYjMzYmIyYzhkNmE5MGZmZjg1MDFiY2I5NTg1ZDFjMmVmZTQ0NWExMWUzODA3YjE4NjE4YjBjZGQyYiJ9fX0=", 750, "&5Witch"),
    CLOUD(5, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDY2YjEwYmY2ZWUyY2Q3ZTNhYzk2ZDk3NDllYTYxNmFhOWM3MzAzMGJkY2FlZmZhZWQyNDllNTVjODQ5OTRhYyJ9fX0=", 600, "&bCloud"),
    SPIT(6, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzA4N2E1NTZkNGZmYTk1ZWNkMjg0NGYzNTBkYzQzZTI1NGU1ZDUzNWZhNTk2ZjU0MGQ3ZTc3ZmE2N2RmNDY5NiJ9fX0=", 600, "&fSpit"),
    LARGE_SMOKE(7, "item:BLAST_FURNACE", 600, "&8Large Smoke"),
    NOTE(8, "item:NOTE_BLOCK", 1500, "&4Note"),
    PORTAL(9, "item:END_PORTAL_FRAME", 2000, "&dPortal"),
    SMOKE(10, "item:FURNACE", 300, "&8Smoke"),
    EXPLOSION(11, "item:TNT_MINECART", 1000, "&fExplosion"),
    SOUL(12, "item:SOUL_SAND", 1300, "&8Soul"),
    LAVA(13, "item:LAVA_BUCKET", 1000, "&6Lava"),
    SQUID_INK(14, "item:INK_SAC", 200, "&9Squid Ink"),
    HAPPY_VILLAGER(15, "item:EMERALD", 650, "&aHappy Villager"),
    POOF(16, "item:WHITE_DYE", 500, "&9Poof"),
    TOTEM_OF_UNDYING(17, "item:TOTEM_OF_UNDYING", 1600, "&6Totem of Undying"),
    DRAGON_BREATH(18, "item:DRAGON_BREATH", 2500, "&5Dragon Breath"),
    SOUL_FIRE_FLAME(19, "item:SOUL_CAMPFIRE", 1500, "&bSoul Fire Flame"),
    FIREWORK(20, "item:FIREWORK_ROCKET", 1500, "&cFirework"),
    INSTANT_EFFECT(21, "item:WHITE_TULIP", 600, "&aInstant Effect"),
    ENCHANTED_HIT(22, "item:IRON_SWORD", 900, "&5Enchanted Hit");

    @Getter private int id, price;
    @Getter private String texture, displayName;

    PiratesCosmeticKillParticles(int id, String texture, int price, String displayName) {
        this.id = id;
        this.texture = texture;
        this.price = price;
        this.displayName = displayName;
    }

    @Override
    public String getBaseName() {
        return "Kill Particles";
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
        return playerSettings.getSettings(getType()).getPurchased().contains(id);
    }

    @Override
    public int activeID(PiratesCosmeticsPlayer playerSettings) {
        return playerSettings.getSettings(getType()).getActiveID();
    }

    @Override
    public int[] getAvailableSlots(int index) {
        int array[] = new int[]{10,11,12,13,14,15,16,19,20,21,22,23,24,25,28,29,30,31,32,33,34,39,40,41};
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
        return PiratesCosmeticsType.KILL_PARTICLES;
    }

    @Override
    public List<String> getUpdatedLore(PiratesCosmeticsPlayer playerSettings) {
        PiratesCosmeticsPlayer.Settings settings = playerSettings.getSettings(getType());

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
