package example.content.items;

import mindustry.graphics.MultiPacker;
import mindustry.type.Item;

public class Singularity {
    public static Item Singularity;
    public static void load(){
        Singularity = new Item("奇点"){
            {
                hardness = 5;
                alwaysUnlocked = true;
                loadIcon();
            }
        };
    }
}
