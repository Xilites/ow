package example.content.items;

import mindustry.type.Item;

public class TungstenDrillBits {
    public static Item TungstenDrillBits;
    public static void load(){
        TungstenDrillBits = new Item("TungstenDrillBits"){
            {
                hardness = 2;
            }
        };
    }
}
