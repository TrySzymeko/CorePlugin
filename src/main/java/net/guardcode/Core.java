package net.guardcode;

import net.guardcode.commands.DayCommand;
import net.guardcode.commands.MessageCommand;
import net.guardcode.commands.NightCommand;
import net.guardcode.listeners.PlayerJoinQuitListener;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Core extends JavaPlugin {

    /*
    * Created by Szymeko!
    * Created by GuardCodeTeam!
    */

    //nie chce mi sie dawac duzo kometarzy wiec bede dawal tylko do czegos ważniejszego xD


    public static Core instance;

    @Override
    public void onEnable() {
        this.saveDefaultConfig();

        getServer().getLogger().info("Loading Core Plugin!");

        this.regCommands();
        this.regListeners();
    }


    @Override
    public void onDisable() {
        getServer().getLogger().info("Disabling Core Plugin!");
    }



    public void regCommands() {
        getServer().getLogger().info("Loading Commands");
        getCommand("msg").setExecutor(new MessageCommand());
        getCommand("night").setExecutor(new NightCommand());
        getCommand("day").setExecutor(new DayCommand());
    }

    public void regListeners() {
        getServer().getLogger().info("Loading Listeners");
        getServer().getPluginManager().registerEvents((Listener)new PlayerJoinQuitListener(), (Plugin)this);

    }
    public static Core getInstance() {
        return Core.instance;
    }
}
