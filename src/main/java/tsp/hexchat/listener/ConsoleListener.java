package tsp.hexchat.listener;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerCommandEvent;
import tsp.hexchat.HexChat;
import tsp.hexchat.util.HexUtils;

public class ConsoleListener implements Listener {

    public ConsoleListener() {
        if (HexChat.getInstance().getConfig().getBoolean("formatConsole")) {
            Bukkit.getPluginManager().registerEvents(this, HexChat.getInstance());
        }
    }

    @EventHandler
    public void onConsoleMessage(ServerCommandEvent e) {
        e.setCommand(HexUtils.format(e.getCommand()));
    }

}
