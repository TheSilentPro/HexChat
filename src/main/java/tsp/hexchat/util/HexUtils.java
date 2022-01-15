package tsp.hexchat.util;

import net.md_5.bungee.api.ChatColor;
import tsp.hexchat.HexChat;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HexUtils {

    public static final Pattern HEX_PATTERN = Pattern.compile(HexChat.getInstance().getConfig().getString("pattern"));

    public static String format(String string) {
        Matcher matcher = HEX_PATTERN.matcher(string);
        while (matcher.find()) {
            string = string.replace(matcher.group(), "" + ChatColor.of(matcher.group()));
        }

        return string;
    }

}
