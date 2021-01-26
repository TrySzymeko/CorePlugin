package net.guardcode.utils;

import org.bukkit.ChatColor;

public final class ColorUtils {

    /*
     * Created by Szymeko!
     * Created by GuardCodeTeam!
     */

    public static String fixColor(String text) {
        return ChatColor.translateAlternateColorCodes('&', text.replace(">>", "»").replace("<<", "«"));
    }
}
