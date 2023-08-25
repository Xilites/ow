package example.content;

import mindustry.content.Fx;
import mindustry.content.Items;
import mindustry.type.Category;
import mindustry.type.Item;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.blocks.production.GenericCrafter;
import mindustry.world.blocks.production.HeatCrafter;
import mindustry.world.draw.*;

import static mindustry.type.ItemStack.with;

public class ModBlock {
    public static Block CollapseMachine;
    public static void load(){
        CollapseMachine = new HeatCrafter("坍缩机"){
            {
                requirements(Category.crafting,with(Items.carbide,100));
                craftEffect = Fx.none;
                outputItem = new ItemStack(ModItem.BlackHole,1);
                craftTime = 60f * 3f;
                size = 4;
                itemCapacity = 120;
                hasPower = true;
                consumePower(5f);
            }
        };
    }
}
