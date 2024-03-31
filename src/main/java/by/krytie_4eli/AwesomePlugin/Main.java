package by.krytie_4eli.AwesomePlugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    private static Main instance;
    private Game game;

    public static Main getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;

        getCommand("test").setExecutor(new CmdExec());
        getCommand("test").setTabCompleter(new CmdExec());

        getCommand("game").setExecutor(new GameCommandExecutor());

        getServer().getPluginManager().registerEvents(new ItemsListener(), this);

    }

    @Override
    public void onDisable() {
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}
