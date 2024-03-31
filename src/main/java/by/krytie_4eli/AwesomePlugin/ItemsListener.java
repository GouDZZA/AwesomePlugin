package by.krytie_4eli.AwesomePlugin;

import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class ItemsListener implements Listener {
    @EventHandler
    public void onFallDamage(EntityDamageEvent e) {
        if (e.getEntity() instanceof Player && e.getCause().equals(EntityDamageEvent.DamageCause.FALL)) {
            Player player = (Player) e.getEntity();

            if (!player.getEquipment().getItemInOffHand().getType().equals(Material.AIR) && player.getEquipment().getItemInOffHand().getItemMeta().getDisplayName().equals(CmdExec.NO_FALL_DAMAGE_ITEM)) {
                e.setCancelled(true);
                player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText("Ваши ноги спасены амулетом!"));
            }
        }
    }

}
