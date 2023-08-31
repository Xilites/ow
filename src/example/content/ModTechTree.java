package example.content;

import example.content.items.Singularity;
import example.content.items.Tungsten;
import example.content.items.TungstenBlades;
import example.content.items.TungstenDrillBits;
import mindustry.content.Items;
import mindustry.content.Planets;

import static mindustry.content.TechTree.node;
import static mindustry.content.TechTree.nodeRoot;

public class ModTechTree {
    public static void load(){
        Planets.erekir.techTree = nodeRoot("OldWorld", Singularity.Singularity,() -> {
            node(Items.tungsten,() -> {
                node(TungstenBlades.TungstenBlades);
                node(TungstenDrillBits.TungstenDrillBits);
            });
        });
        if (Items.tungsten.unlocked() && Singularity.Singularity.unlocked()){
            TungstenBlades.TungstenBlades.onUnlock();
            TungstenDrillBits.TungstenDrillBits.onUnlock();
        }
    }
}
