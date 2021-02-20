package net.guardcode.commands;

import net.guardcode.utils.ColorUtils;
import org.bukkit.command.*;
import org.bukkit.entity.*;
import org.bukkit.*;

public class DayCommand implements CommandExecutor {
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        final Player p = (Player) sender;
        if (!p.hasPermission("core.day")) {
            p.sendMessage(ColorUtils.fixColor(" &8>> &7Nie posiadasz dostepu do tej komendy! &8(&ccore.dzien&8)"));
            return false;
        }
        for (final World w : Bukkit.getServer().getWorlds()) {
            w.setTime(1500L);
        }
        Bukkit.broadcastMessage(ColorUtils.fixColor("&8>> &7Na serwerze czas zostal ustawiony &c&nDZIEN&r"));
        return false;
    }
}