package net.shawshark.core.plugin.minigame.cosmetics.settings;

import com.google.common.collect.Lists;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class CosmeticsPlayer {
    public class Settings {
        @Getter@Setter private int activeID = -1; // -1 indicates default null
        @Getter@Setter private List<Integer> purchased = Lists.newArrayList();
    }
}
