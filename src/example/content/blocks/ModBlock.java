package example.content.blocks;

import example.content.ModItem;
import mindustry.content.Fx;
import mindustry.content.Items;
import mindustry.graphics.MultiPacker;
import mindustry.type.Category;
import mindustry.type.Item;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.blocks.campaign.LaunchPad;
import mindustry.world.blocks.production.GenericCrafter;
import mindustry.world.blocks.production.HeatCrafter;
import mindustry.world.draw.*;
import mindustry.world.meta.BuildVisibility;

import static mindustry.content.Blocks.siliconArcFurnace;
import static mindustry.type.ItemStack.with;

public class ModBlock {
    public static void load(){
        CollapseMachine.load();
        SubstanceConveyor.load();
    }
}
