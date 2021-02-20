package net.guardcode.commands;

import net.guardcode.utils.ColorUtils;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MessageCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String str, String[] args) {
        if (args.length > 0) {

            final Player to = Bukkit.getPlayer(args[0]);
            final Player p = (Player)sender;

            if(args.length == 2) {
                if (to != null) {

                    final StringBuilder sb = new StringBuilder();
                    for (int i = 1; i < args.length; ++i) {
                        sb.append(args[i]).append(" ");
                    }
                    final String message = sb.toString();

                    p.sendMessage(ColorUtils.fixColor("&8[&bJa -> " + to.getName() + "&8]&f " + message));
                    to.sendMessage(ColorUtils.fixColor("&8[&b" + to.getName() + " -> Ja&8]&f " + message));
                    return true;
                }
                sender.sendMessage(ColorUtils.fixColor("&6* &7Podany gracz jest offline"));
                return true;
            }
            sender.sendMessage(ColorUtils.fixColor("&6* &7Poprawne uzycie: &c/msg <gracz> <wiadomosc>"));
            return true;
        }
        sender.sendMessage(ColorUtils.fixColor("&6* &7Poprawne uzycie: &c/msg <gracz> <wiadomosc>"));
        return false;
    }
}