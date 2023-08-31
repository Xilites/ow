package example.content.blocks;

import mindustry.content.Items;
import mindustry.type.Category;
import mindustry.world.Block;
import mindustry.world.blocks.campaign.LaunchPad;
import mindustry.world.meta.BuildVisibility;

import static mindustry.type.ItemStack.with;

public class SubstanceConveyor {
    public static Block SubstanceConveyor;

    public static void load(){
        SubstanceConveyor = new LaunchPad("物质传送平台"){
            {
                requirements(Category.effect, BuildVisibility.campaignOnly,with(Items.carbide,1));
                size = 4;
                itemCapacity = 5;
                hasPower = true;
                launchTime = 60f * 2;
                consumePower(5f);
            }
        };
    }
}
