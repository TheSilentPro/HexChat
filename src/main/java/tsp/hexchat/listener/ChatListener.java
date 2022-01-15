package tsp.hexchat.listener;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import tsp.hexchat.HexChat;
import tsp.hexchat.util.HexUtils;

public class ChatListener implements Listener {

    public ChatListener() {
        Bukkit.getPluginManager().registerEvents(this, HexChat.getInstance());
    }

    @EventHandler
    public void onChat(AsyncPlayerChatEvent e) {
        if (e.getPlayer().hasPermission("hexchat.use")) {
            e.setMessage(HexUtils.format(e.getMessage()));
        }
    }

}
