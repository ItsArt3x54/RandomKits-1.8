package be.artex.randomkits.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class OnDamage implements Listener {
    @EventHandler
    public void onPlayerDamage(EntityDamageEvent e) {

        if (e.getCause() == EntityDamageEvent.DamageCause.FALL) {

            e.setCancelled(true);

        } else {

            return;

        }

    }

}
