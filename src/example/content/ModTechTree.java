package example.content;

import mindustry.content.Items;
import mindustry.content.Planets;

import static mindustry.content.TechTree.node;
import static mindustry.content.TechTree.nodeRoot;

public class ModTechTree {
    public static void load(){
        Planets.erekir.techTree = nodeRoot("OldWorld",ModBlock.CollapseMachine,() -> {
            node(ModItem.BlackHole);
            node(ModBlock.SubstanceConveyor);
        });
        if (Items.carbide.unlocked()){
            ModBlock.CollapseMachine.onUnlock();
        }
        if (ModBlock.CollapseMachine.unlocked()){
            ModBlock.SubstanceConveyor.onUnlock();
        }
    }
}
