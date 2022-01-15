package tsp.hexchat;

import org.bukkit.plugin.java.JavaPlugin;
import tsp.hexchat.listener.ChatListener;
import tsp.hexchat.listener.ConsoleListener;
import tsp.hexchat.util.Metrics;

public class HexChat extends JavaPlugin {

    private static HexChat instance;

    @Override
    public void onEnable() {
        instance = this;
        saveDefaultConfig();

        new ChatListener();
        new ConsoleListener();

        new Metrics(this, 13966);
    }

    public static HexChat getInstance() {
        return instance;
    }

}
