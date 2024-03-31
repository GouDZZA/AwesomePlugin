package by.krytie_4eli.testprojectt;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class CmdExec implements CommandExecutor, TabExecutor {

    public static String NO_FALL_DAMAGE_ITEM = ChatColor.GOLD + "Амулет каменных ног";

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        if (args.length >= 1 ) {
            if (commandSender instanceof Player) {
                Player sender = (Player) commandSender;
                switch (args[0].toLowerCase()){

                    case "enchant":
                        ItemStack itemInHand = sender.getEquipment().getItemInMainHand();
                        ItemMeta meta = itemInHand.getItemMeta();

                        switch(args[1].toUpperCase()) {
                            case "FIRE_ASPECT":
                            case "ЗАГОВОР_ОГНЯ":
                                meta.addEnchant(Enchantment.FIRE_ASPECT, Integer.parseInt(args[2]), true);
                                itemInHand.setItemMeta(meta);

                                sender.sendMessage("Заговор огня успешно применен!");

                                return true;

                        }

                    case "item":
                        ItemStack item = new ItemStack(Material.NETHER_STAR);
                        ItemMeta anotherMeta = item.getItemMeta();
                        anotherMeta.setDisplayName(NO_FALL_DAMAGE_ITEM);
                        item.setItemMeta(anotherMeta);

                        sender.getInventory().addItem(item);
                        sender.sendMessage("Амулет каменных ног выдан!");
                        
                        return true;
                }
            } else commandSender.sendMessage("only players");
        }
        return false;
    }

    @Override
    public List<String> onTabComplete(CommandSender commandSender, Command command, String s, String[] strings) {
        return null;
    }
}
