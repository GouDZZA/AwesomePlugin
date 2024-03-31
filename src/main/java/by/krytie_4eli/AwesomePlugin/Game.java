package by.krytie_4eli.AwesomePlugin;

import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Set;

public class Game {
    Set<Player> players;
    int time;
    HashMap<Integer, Double> stages;

    public Game(int time, HashMap<Integer, Double> stages){
        this.players = null;
        this.time = time;
        this.stages = stages;
    }
}
