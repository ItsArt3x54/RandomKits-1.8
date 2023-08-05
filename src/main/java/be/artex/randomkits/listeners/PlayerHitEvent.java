package be.artex.randomkits.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;


public class PlayerHitEvent implements Listener {
    @EventHandler
    public void onPlayerHit(EntityDamageEvent e) {

        if (e.getEntity().getLocation().getBlockY() > 53 ) {

            e.setCancelled(true);

        } else {
            return;
        }

    }

}
