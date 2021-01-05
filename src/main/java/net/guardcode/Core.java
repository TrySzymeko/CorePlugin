package net.guardcode;

import net.guardcode.manager.RegisterEvents;
import org.bukkit.plugin.java.JavaPlugin;

public class Core extends JavaPlugin {

    @Override
    public void onEnable() {
        RegisterEvents.regCommands();
        RegisterEvents.regListeners();
    }

    @Override
    public void onDisable() {

    }


}
