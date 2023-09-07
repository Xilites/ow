package example.content.blocks;

import example.content.items.BlackHole;
import mindustry.content.Blocks;
import mindustry.content.Items;
import mindustry.type.Category;
import mindustry.type.Item;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.blocks.campaign.LaunchPad;
import mindustry.world.blocks.production.GenericCrafter;

import static mindustry.type.ItemStack.with;
import static mindustry.world.meta.StatValues.ammo;


public class CollapseMachine {
    public static Block CollapseMachine;
    public static void load(){
        CollapseMachine = new GenericCrafter("坍缩机"){
            {
                requirements(Category.crafting, with(Items.carbide,50));

                outputItem = new ItemStack(BlackHole.BlackHole,3);
                craftTime = 30f;
                size = 2;
                hasItems = true;

                consumeItem(Items.carbide,3);
                consumePower(20f);
            }
        };
    }
}
