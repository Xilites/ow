package example.content.blocks;

import example.content.items.BlackHole;
import mindustry.content.Fx;
import mindustry.content.Items;

import mindustry.type.Category;

import mindustry.type.ItemStack;
import mindustry.world.Block;

import mindustry.world.blocks.production.GenericCrafter;

import static mindustry.type.ItemStack.with;

public class CollapseMachine {
    public static Block CollapseMachine;
    public static void load(){
        CollapseMachine = new GenericCrafter("CollapseMachine"){
            {
                requirements(Category.crafting,with(Items.carbide,1));
                craftEffect = Fx.none;
                outputItem = new ItemStack(BlackHole.BlackHole,1);
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
