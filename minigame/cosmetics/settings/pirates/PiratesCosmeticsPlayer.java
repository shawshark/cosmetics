package net.shawshark.core.plugin.minigame.cosmetics.settings.pirates;

import com.google.common.collect.Lists;
import lombok.Getter;
import lombok.Setter;
import net.shawshark.core.plugin.minigame.cosmetics.settings.CosmeticsPlayer;

import java.util.HashMap;
import java.util.List;

public class PiratesCosmeticsPlayer extends CosmeticsPlayer {

    @Getter private PiratesSettings settings;
    @Getter private HashMap<PiratesCosmeticsType, Settings> cosmeticsSettings = new HashMap<>();

    public PiratesCosmeticsPlayer(PiratesSettings settings) {
        this.settings = settings;
        
        for(PiratesCosmeticsType type : PiratesCosmeticsType.values()) {
            getCosmeticsSettings().put(type, new Settings());
        }
    }

    public Settings getSettings(PiratesCosmeticsType type) {
        return getCosmeticsSettings().get(type);
    }
}