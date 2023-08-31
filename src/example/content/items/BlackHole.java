package example.content.items;

import mindustry.type.Item;

public class BlackHole {
    public static Item BlackHole;
    public static void load(){
        BlackHole = new Item("黑洞"){
            {
                hardness = 1;
                cost = 1;
            }
        };
    }
}
