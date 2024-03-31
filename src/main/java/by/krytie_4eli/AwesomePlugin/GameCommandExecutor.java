package by.krytie_4eli.AwesomePlugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.HashMap;
import java.util.function.DoublePredicate;

public class GameCommandExecutor implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        if (args.length == 1)
            switch (args[0].toLowerCase()){
                case "start":

                    HashMap<Integer, Double> stages = new HashMap<>();

                    stages.put(1, 300D);
                    stages.put(2, 200D);
                    stages.put(3, 100D);
                    stages.put(4, 50D);
                    stages.put(5, 10D);

                    Game game = new Game(1800, stages);
                    Main.getInstance().setGame(game);

                case "end":

                case "join":
                default:
                    return true;
            }

        return false;
    }
}
