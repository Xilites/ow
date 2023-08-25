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

public class CollapseMachine {
    public static Block CollapseMachine;
    public static void load(){
        CollapseMachine = new GenericCrafter("CollapseMachine"){
            {
                requirements(Category.crafting,with(Items.carbide,1));
                craftEffect = Fx.none;
                outputItem = new ItemStack(ModItem.BlackHole,1);
                craftTime = 60f * 3f;
                size = 4;
                itemCapacity = 120;
                hasPower = true;
                hasItems = true;
                consumePower(5f);
                consumeItem(Items.carbide,32);
            }
        };
    }
}
