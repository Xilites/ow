package example.content.items;

import mindustry.type.Item;

public class BlackHole {
    public static Item BlackHole;
    public static void load(){
        BlackHole = new Item("BlackHole"){
            {
                hardness = 5;
            }
        };
    }
}
