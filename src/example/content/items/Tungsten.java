package example.content.items;

import mindustry.type.Item;

public class Tungsten {
    public static Item Tungsten;
    public static void load(){
        Tungsten = new Item("钨"){
            {
                hardness = 2;
                alwaysUnlocked = true;
            }
        };
    }
}
