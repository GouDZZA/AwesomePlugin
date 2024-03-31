package by.krytie_4eli.testprojectt;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class ItemsListener implements Listener {
    @EventHandler
    public void onFallDamage(EntityDamageEvent e) {
        if (e.getEntity() instanceof Player && e.getCause().equals(EntityDamageEvent.DamageCause.FALL)) {
            Player player = (Player) e.getEntity();

            if (player.getEquipment().getItemInOffHand().getItemMeta().getDisplayName().equals(CmdExec.NO_FALL_DAMAGE_ITEM)) {
                e.setCancelled(true);
            }
        }
    }

}
