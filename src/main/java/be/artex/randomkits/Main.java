package be.artex.randomkits;

import be.artex.randomkits.listeners.OnDamage;
import be.artex.randomkits.listeners.OnPlayerJoin;
import be.artex.randomkits.listeners.PlayerHitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    public static JavaPlugin PLUGIN;

    @Override
    public void onEnable() {
        // Plugin startup logic
        PLUGIN = this;

        getServer().getPluginManager().registerEvents(new OnPlayerJoin(), this);
        getServer().getPluginManager().registerEvents(new OnDamage(), this);
        getServer().getPluginManager().registerEvents(new PlayerHitEvent(), this);
        
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
