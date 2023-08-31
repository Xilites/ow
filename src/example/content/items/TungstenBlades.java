package example.content.items;

import mindustry.type.Item;

public class TungstenBlades {
    public static Item TungstenBlades;
    public static void load(){
        TungstenBlades = new Item("TungstenBlades"){
            {
                hardness = 2;
            }
        };
    }
}
