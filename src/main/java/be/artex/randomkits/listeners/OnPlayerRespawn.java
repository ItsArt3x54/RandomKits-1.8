package be.artex.randomkits.listeners;

import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;

public class OnPlayerRespawn implements Listener {
    @EventHandler
    public void onPlayerRespawn(PlayerRespawnEvent e) {

        e.getPlayer().teleport(new Location(e.getPlayer().getWorld(), 377, 79, 942));

        e.getPlayer().getInventory().addItem();

    }
}
