package example.content;

import example.content.items.BlackHole;
import mindustry.content.Items;
import mindustry.content.Planets;

import static mindustry.content.TechTree.node;
import static mindustry.content.TechTree.nodeRoot;

import example.content.blocks.CollapseMachine;
import example.content.blocks.SubstanceConveyor;

public class ModTechTree {
    public static void load(){
        Planets.erekir.techTree = nodeRoot("OldWorld", CollapseMachine.CollapseMachine,() -> {
            node(BlackHole.BlackHole);
            node(SubstanceConveyor.SubstanceConveyor);
        });
        if (Items.carbide.unlocked()){
            CollapseMachine.CollapseMachine.onUnlock();
        }
        if (CollapseMachine.CollapseMachine.unlocked()){
            SubstanceConveyor.SubstanceConveyor.onUnlock();
        }
    }
}
