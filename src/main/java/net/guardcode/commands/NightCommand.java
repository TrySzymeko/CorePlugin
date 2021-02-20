package net.guardcode.commands;

import net.guardcode.utils.ColorUtils;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class NightCommand implements CommandExecutor {

    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        final Player p = (Player) sender;
        if (!p.hasPermission("core.noc")) {
            p.sendMessage(ColorUtils.fixColor(" &8>> &7Nie posiadasz dostepu do tej komendy! &8(&ccore.noc&8)"));
            return false;
        }
        for (final World w : Bukkit.getServer().getWorlds()) {
            w.setTime(14000L);
        }
        Bukkit.broadcastMessage(ColorUtils.fixColor("&8>> &7Na serwerze czas zostala ustawiona &c&nNoc&r"));
        return false;
    }
}