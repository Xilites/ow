package example.content.items;

import mindustry.type.Item;

public class TungstenBlades {
    public static Item TungstenBlades;
    public static void load(){
        TungstenBlades = new Item("钨制刀片"){
            {
                hardness = 2;
            }
        };
    }
}
