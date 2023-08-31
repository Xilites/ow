package example;

import arc.*;
import arc.util.*;
import example.content.ModTechTree;
import example.content.items.Tungsten;
import example.content.items.TungstenBlades;
import example.content.items.TungstenDrillBits;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

public class ExampleJavaMod extends Mod{

    public ExampleJavaMod(){
        Log.info("Loaded ExampleJavaMod constructor.");

        //listen for game load event
        Events.on(ClientLoadEvent.class, e -> {
            //show dialog upon startup
            Time.runTask(10f, () -> {
                BaseDialog dialog = new BaseDialog("INFO");
                dialog.cont.add("LOADED").row();
                //mod sprites are prefixed with the mod name (this mod is called 'example-java-mod' in its config)
                dialog.cont.button("I see", dialog::hide).size(100f, 50f);
                dialog.show();
            });
        });
    }

    @Override
    public void loadContent(){
        Log.info("Loading some example example.content.");
        Tungsten.load();
        TungstenBlades.load();
        TungstenDrillBits.load();
        ModTechTree.load();
    }

}
