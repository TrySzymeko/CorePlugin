package net.guardcode.utils;

import org.bukkit.ChatColor;

public final class ColorUtils {
    public static String fixColor(String text) {
        return ChatColor.translateAlternateColorCodes('&', text.replace(">>", "»").replace("<<", "«"));
    }
}
