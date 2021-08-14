package net.shawshark.core.plugin.minigame.cosmetics.settings.pirates;

import lombok.Getter;
import net.shawshark.core.plugin.minigame.cosmetics.settings.Cosmetic;
import org.bukkit.Material;

public enum PiratesCosmeticsType {

    BALLOONS(1, 13, "&aBalloons", PiratesCosmeticBalloons.values(), null, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTJkZDExZGEwNDI1MmY3NmI2OTM0YmMyNjYxMmY1NGYyNjRmMzBlZWQ3NGRmODk5NDEyMDllMTkxYmViYzBhMiJ9fX0="),
    HIT_PARTICLES(2, 21, "&cHit Particles", PiratesCosmeticHat.values(), Material.LEATHER_CHESTPLATE, null),
    SHOOTING_TRAILS(3,22, "&bShooting Trails", PiratesCosmeticHat.values(), Material.BLAZE_POWDER, null),
    KILL_PARTICLES(4,23, "&1Kill Particles", PiratesCosmeticHat.values(), Material.IRON_SWORD, null),
    KILL_MESSAGES(5,30, "&eKill Messages", PiratesKillMessages.values(), Material.PAPER, null),
    HATS(6, 31, "&6Hats", PiratesCosmeticHat.values(), Material.CHEST, null),
    KILL_SOUNDS(7, 32, "&dKill Sounds", PiratesCosmeticHat.values(), Material.JUKEBOX, null);

    @Getter private int id, slotID;
    @Getter private String displayName;
    @Getter private Cosmetic[] cosmetic;

    @Getter private String tableName;
    @Getter private boolean base64Head;
    @Getter private String base64HeadData;
    @Getter private Material material;

    PiratesCosmeticsType(int id, int slotID, String displayName, Cosmetic[] cosmetic, Material material, String base64Data) {
        this.id = id;
        this.slotID = slotID;

        this.displayName = displayName;
        this.cosmetic = cosmetic;

        this.tableName = toString().toLowerCase();

        this.base64Head = (material == null);
        this.material = material;
        this.base64HeadData = base64Data;

    }
}
