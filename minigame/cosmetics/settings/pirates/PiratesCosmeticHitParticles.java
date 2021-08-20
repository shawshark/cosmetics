package net.shawshark.core.plugin.minigame.cosmetics.settings.pirates;

import lombok.Getter;
import net.shawshark.core.plugin.minigame.cosmetics.CosmeticPreviewType;
import net.shawshark.core.plugin.minigame.cosmetics.settings.Cosmetic;

import java.util.Arrays;
import java.util.List;

public enum PiratesCosmeticHitParticles implements Cosmetic {
    DISABLE(-1, "item:BARRIER", 0, "&cNone"),
    WITCH(0, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjk1MDJhYjMzYmIyYzhkNmE5MGZmZjg1MDFiY2I5NTg1ZDFjMmVmZTQ0NWExMWUzODA3YjE4NjE4YjBjZGQyYiJ9fX0=", 550, "&5Witch"),
    EFFECT(1, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTUyNzAxYzY4NzFiYWUwM2MxYzM3NzA1ZDQzNDlmZTA4OGNhOTcwOWJmZGUwN2NhMGYyNzMwNDY5Y2I0ZTQifX19", 300, "&dEffect"),
    ANGRY_VILLAGER(2, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODhlOTVkYzU3NmI5ZTRlNWUwZDcwZDY0MDUzZjQ2ZTBiMzJhNTE3NmQ1ODcyYmQ3ZDYwODEwYTNjM2ExODRhYSJ9fX0=", 600, "&2Angry Villager"),
    SPLIT(3, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzA4N2E1NTZkNGZmYTk1ZWNkMjg0NGYzNTBkYzQzZTI1NGU1ZDUzNWZhNTk2ZjU0MGQ3ZTc3ZmE2N2RmNDY5NiJ9fX0=", 300, "&fSpit"),
    HEART(4, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmM4ZmI2MzdkNmUxYTdiYThmYTk3ZWU5ZDI5MTVlODQzZThlYzc5MGQ4YjdiZjYwNDhiZTYyMWVlNGQ1OWZiYSJ9fX0=", 1000, "&cHeart"),
    CLOUD(5, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDY2YjEwYmY2ZWUyY2Q3ZTNhYzk2ZDk3NDllYTYxNmFhOWM3MzAzMGJkY2FlZmZhZWQyNDllNTVjODQ5OTRhYyJ9fX0=", 500, "&bCloud"),
    LARGE_SMOKE(6, "item:BLAST_FURNACE", 750, "&8Large Smoke"),
    NOTE(7, "item:NOTE_BLOCK", 1750, "&4Note"),
    SOUL_FIRE_FLAME(8, "item:SOUL_CAMPFIRE", 1200, "&bSoul Fire Flame"),
    SMOKE(9, "item:eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjk5MTA1MWE4M2NiM2M5MWJiYzRhNzY4NWE1ZWVkNWJmOTFlYjc5NzlmOTIxYTAxNDVmYzlmYWYxZWRlNjI2NSJ9fX0=", 500, "&8Smoke"),
    PORTAL(10, "item:END_PORTAL_FRAME", 1600, "&dPortal"),
    EXPLOSION(11, "item:TNT_MINECART", 1250, "&fExplosion"),
    SOUL(12, "item:SOUL_SAND", 1000, "&8Soul"),
    POOF(13, "item:WHITE_DYE", 550, "&9Poof"),
    HAPPY_VILLAGER(14, "item:EMERALD", 750, "&aHappy Villager"),
    LAVA(15, "item:LAVA_BUCKET", 950, "&6Lava"),
    TOTEM_OF_UNDYING(16, "item:TOTEM_OF_UNDYING", 3500, "&4Totem of Undying"),
    CRIT(17, "item:WOODEN_SWORD", 800, "&fCrit"),
    ENCHANTED_HIT(18, "item:IRON_SWORD", 1750, "&5Enchanted Hit"),
    FLAME(19, "item:FLINT_AND_STEEL", 1500, "&6Flame"),
    ENTITY_EFFECT(20, "item:LEGACY_POTION", 900, "&3Entity Effect"),
    INSTANT_EFFECT(21, "item:WHITE_TULIP", 600, "&eInstant Effect");

    @Getter private int id, price;
    @Getter private String texture, displayName;

    PiratesCosmeticHitParticles(int id, String texture, int price, String displayName) {
        this.id = id;
        this.texture = texture;
        this.price = price;
        this.displayName = displayName;
    }

    @Override
    public String getBaseName() {
        return "Hit Particle";
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
        int array[] = new int[]{10,11,12,13,14,15,19,20,21,22,23,24,25,28,29,30,31,32,33,34,39,40,41};
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
        return PiratesCosmeticsType.HIT_PARTICLES;
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
