package example.content;

import mindustry.content.Fx;
import mindustry.content.Items;
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
    public static Block CollapseMachine;
    public static Block SubstanceConveyor;
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
        SubstanceConveyor = new LaunchPad("SubstanceConveyor"){
            {
                requirements(Category.effect,BuildVisibility.campaignOnly,with(Items.carbide,1));
                size = 4;
                itemCapacity = 5;
                hasPower = true;
                launchTime = 60f * 2;
                consumePower(5f);
            }
        };
    }
}
