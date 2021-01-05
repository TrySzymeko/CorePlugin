package net.guardcode.manager;

import org.bukkit.Bukkit;

public class RegisterEvents {

    public static void regCommands() {
        Bukkit.getServer().getLogger().info("Loading Commands");
    }

    public static void regListeners() {
        Bukkit.getServer().getLogger().info("Loading Listeners");
    }

}
