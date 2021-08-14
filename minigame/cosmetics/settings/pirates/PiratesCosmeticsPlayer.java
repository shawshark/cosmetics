package net.shawshark.core.plugin.minigame.cosmetics.settings.pirates;

import com.google.common.collect.Lists;
import lombok.Getter;
import lombok.Setter;
import scala.Int;

import java.util.List;

public class PiratesCosmeticsPlayer {

    @Getter private PiratesSettings settings;

    @Getter@Setter private int activeHatID = -1; // -1 indicates default null
    @Getter@Setter private List<Integer> purchasedHats = Lists.newArrayList();

    public PiratesCosmeticsPlayer(PiratesSettings settings) {
        this.settings = settings;
    }
}