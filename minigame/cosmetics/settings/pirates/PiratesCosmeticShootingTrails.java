package net.shawshark.core.plugin.minigame.cosmetics.settings.pirates;

import lombok.Getter;
import net.shawshark.core.plugin.minigame.cosmetics.CosmeticPreviewType;
import net.shawshark.core.plugin.minigame.cosmetics.settings.Cosmetic;
import org.bukkit.Material;

import java.util.Arrays;
import java.util.List;

public enum PiratesCosmeticShootingTrails implements Cosmetic {

    DEFAULT(-1, "item:BARRIER", 0, "&cNone"),
    CRIT(0, "item:WOODEN_SWORD", 0, "&fCrit"),
    ENCHANTED_HIT(1, "item:IRON_SWORD", 800, "&5Enchanted Hit"),
    ANGRY_VILLAGER(2, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODhlOTVkYzU3NmI5ZTRlNWUwZDcwZDY0MDUzZjQ2ZTBiMzJhNTE3NmQ1ODcyYmQ3ZDYwODEwYTNjM2ExODRhYSJ9fX0=", 500, "&2Angry Villager"),
    CLOUD(3, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDY2YjEwYmY2ZWUyY2Q3ZTNhYzk2ZDk3NDllYTYxNmFhOWM3MzAzMGJkY2FlZmZhZWQyNDllNTVjODQ5OTRhYyJ9fX0=", 400, "&bCloud"),
    WITCH(4, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjk1MDJhYjMzYmIyYzhkNmE5MGZmZjg1MDFiY2I5NTg1ZDFjMmVmZTQ0NWExMWUzODA3YjE4NjE4YjBjZGQyYiJ9fX0=", 600, "&5Witch"),
    EFFECT(5, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTUyNzAxYzY4NzFiYWUwM2MxYzM3NzA1ZDQzNDlmZTA4OGNhOTcwOWJmZGUwN2NhMGYyNzMwNDY5Y2I0ZTQifX19", 850, "&dEffect"),
    HEART(6, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmM4ZmI2MzdkNmUxYTdiYThmYTk3ZWU5ZDI5MTVlODQzZThlYzc5MGQ4YjdiZjYwNDhiZTYyMWVlNGQ1OWZiYSJ9fX0=", 1000, "&cHeart"),
    SPIT(7, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzA4N2E1NTZkNGZmYTk1ZWNkMjg0NGYzNTBkYzQzZTI1NGU1ZDUzNWZhNTk2ZjU0MGQ3ZTc3ZmE2N2RmNDY5NiJ9fX0", 300, "&fSpit"),
    SNEEZE(8, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODQyNDc4MGIzYzVjNTM1MWNmNDlmYjViZjQxZmNiMjg5NDkxZGY2YzQzMDY4M2M4NGQ3ODQ2MTg4ZGI0Zjg0ZCJ9fX0=", 600, "&aSneeze"),
    ENTITY_EFFECT(9, "item:LEGACY_POTION", 600, "&3Entity Effect"),
    FIREWORK(10, "item:FIREWORK_ROCKET", 1100, "&cFirework"),
    DRAGON_DREATH(11, "item:DRAGON_BREATH", 500, "&5Dragon Breath"),
    HAPPY_VILLAGER(12, "item:EMERALD", 750, "&aHappy Villager"),
    NOTE(13, "item:NOTE_BLOCK", 2000, "&dNote"),
    SMOKE(14, "item:FURNACE", 400, "&8Smoke"),
    SOUL(15, "item:SOUL_SAND", 950, "&8Soul"),
    NOTE_SPIRAL(16, "item:JUKEBOX", 2500, "&5Note Spiral"),
    LARGE_SMOKE(17, "item:BLAST_FURNACE", 700, "&8Large Smoke"),
    LAVA(18, "item:LAVA_BUCKET", 900, "&6Lava"),
    SOUL_FIRE_FLAME(19, "item:SOUL_CAMPFIRE", 1900, "&bSoul Fire Flame"),
    TOTEM_OF_UNDYING(20, "item:TOTEM_OF_UNDYING", 2000, "&4Totem of Undying"),
    SQUID_INK(21, "item:INK_SAC", 250, "&9Squid Ink"),
    INSTANT_EFFECT(22, "item:WHITE_TULIP", 900, "&eInstant Effect"),
    SNOWBALL(23, "item:SNOWBALL", 1250, "&fSnowball"),
    SLIME(24, "item:SLIME_BALL", 1000,"&2Slime"),
    POOF(25, "item:WHITE_DYE", 900, "&9Poof"),
    FLAME(26, "item:FLINT_AND_STEEL", 1500, "&6Flame"),
    GOLD_NUGGESTS(27, "item:GOLD_NUGGET", 1000, "Gold Nuggets"),
    GOLD_INGOT_SPIRAL(28, "item:GOLD_INGOT", 1500, "&6Gold Ingot Spiral"),
    DISC_MANIAC(29, "item:MUSIC_DISC_11", 3000, "&1Disc Maniac"),
    YOUR_HEAD(30, "item:PLAYER_HEAD", 5000, "&4Your Head");

    @Getter private int id, price;
    @Getter private String texture, displayName;

    PiratesCosmeticShootingTrails(int id, String texture, int price, String displayName) {
        this.id = id;
        this.texture = texture;
        this.price = price;
        this.displayName = displayName;
    }

    @Override
    public String getBaseName() {
        return "Shooting Trails";
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
        if(index == 0) {
            return new int[]{10,11,12,13,14,15,16,19,20,21,22,23,24,25,28,29,30,31,32,33,34,37,38,39,40,41,42,43};
        } else if(index == 1) {
            return new int[]{10,11,12,13};
        } else {
            return null;
        }
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
        return PiratesCosmeticsType.SHOOTING_TRAILS;
    }

    @Override
    public List<String> getUpdatedLore(PiratesCosmeticsPlayer playerSettings) {
        PiratesCosmeticsPlayer.Settings settings = playerSettings.getSettings(getType());

        if(getId() == settings.getActiveID()) {
            return Arrays.asList("", "&cAlready equipped");
        } else if(this == DEFAULT || settings.getPurchased().contains(getId())) {
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
