package example;

import arc.*;
import arc.util.*;
import example.content.ModTechTree;
import example.content.blocks.SubstanceConveyor;
import example.content.items.*;
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
        Singularity.load();
        Tungsten.load();
        TungstenBlades.load();
        TungstenDrillBits.load();
        BlackHole.load();
        SubstanceConveyor.load();
        ModTechTree.load();
    }

}
