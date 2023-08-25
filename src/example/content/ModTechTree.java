package example.content;

import mindustry.content.Planets;

import static mindustry.content.TechTree.node;
import static mindustry.content.TechTree.nodeRoot;

public class ModTechTree {
    public static void load(){
        Planets.erekir.techTree = nodeRoot("OldWorld",ModBlock.CollapseMachine,() -> {
            node(ModItem.BlackHole);
        });
    }
}
