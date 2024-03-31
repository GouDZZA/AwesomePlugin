package by.krytie_4eli.testprojectt;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    private static Main instace;

    public static Main getInstace() {
        return instace;
    }

    @Override
    public void onEnable() {
        instace = this;
    }

    @Override
    public void onDisable() {
    }
}
