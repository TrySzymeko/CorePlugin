package net.guardcode.listeners;

import net.guardcode.utils.ColorUtils;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerJoinQuitListener implements Listener {

    /*
     * Created by Szymeko!
     * Created by GuardCodeTeam!
     */

    @EventHandler
    public void PlayerJoin(final PlayerJoinEvent event) {
        final Player p = event.getPlayer();
        event.setJoinMessage(ColorUtils.fixColor("&8[&2+&8] &7" + p.getName()));

        //jezeli gracz nie gral wczesniej na serwerze
        if (!p.hasPlayedBefore()) {
            p.sendMessage(ColorUtils.fixColor("&8>> &7Czesc, jestes nowym graczem!"));
        }
    }

    @EventHandler
    public void PlayerQuit(final PlayerQuitEvent event) {
        final Player p = event.getPlayer();
        event.setQuitMessage(ColorUtils.fixColor("&8[&4-&8] &7" + p.getName()));
    }
}
