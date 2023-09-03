package example.content.blocks;

import example.content.items.BlackHole;
import mindustry.type.Category;
import mindustry.type.Item;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.blocks.campaign.LaunchPad;
import mindustry.world.meta.BuildVisibility;

import static mindustry.type.ItemStack.with;

public class SubstanceConveyor {
    public static Block SubstanceConveyor;
    public static void load(){
        SubstanceConveyor = new LaunchPad("物质传送机"){
            {
                requirements(Category.power, BuildVisibility.campaignOnly, with(BlackHole.BlackHole,1));
                size = 3;
                launchTime = 2;
                itemCapacity = 20;
                hasPower = true;
                consumePower(10);
                alwaysUnlocked = true;
            }
        };
    }
}

