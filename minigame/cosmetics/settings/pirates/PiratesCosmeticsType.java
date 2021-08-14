package net.shawshark.core.plugin.minigame.cosmetics.settings.pirates;

import lombok.Getter;
import net.shawshark.core.plugin.minigame.cosmetics.settings.Cosmetic;
import org.bukkit.Material;

public enum PiratesCosmeticsType {

    BALLOONS(1, 13, "&aBalloons", PiratesCosmeticHat.values(), Material.GOLD_NUGGET),
    HIT_PARTICLES(2, 21, "&cHit Particles", PiratesCosmeticHat.values(), Material.LEATHER_CHESTPLATE),
    SHOOTING_TRAILS(3,22, "&bShooting Trails", PiratesCosmeticHat.values(), Material.BLAZE_POWDER),
    KILL_PARTICLES(4,23, "&1Kill Particles", PiratesCosmeticHat.values(), Material.IRON_SWORD),
    KILL_MESSAGES(5,30, "&eKill Messages", PiratesCosmeticHat.values(), Material.PAPER),
    HATS(6, 31, "&6Hats", PiratesCosmeticHat.values(), Material.CHEST),
    KILL_SOUNDS(7, 32, "&dKill Sounds", PiratesCosmeticHat.values(), Material.JUKEBOX);

    @Getter private int id, slotID;
    @Getter private String displayName;
    @Getter private Cosmetic[] cosmetic;

    @Getter private String tableName;
    @Getter private Material material;

    PiratesCosmeticsType(int id, int slotID, String displayName, Cosmetic[] cosmetic, Material material) {
        this.id = id;
        this.slotID = slotID;

        this.displayName = displayName;
        this.cosmetic = cosmetic;

        this.tableName = toString().toLowerCase();
        this.material = material;
    }
}
