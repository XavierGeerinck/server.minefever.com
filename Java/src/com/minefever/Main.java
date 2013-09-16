package com.minefever;

import com.minefever.events.OnUserLogin;
import com.minefever.handlers.MysqlHandler;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created with IntelliJ IDEA.
 * User: xanrin
 * Date: 15/09/13
 * Time: 11:25
 * To change this template use File | Settings | File Templates.
 */
public final class Main extends JavaPlugin {
    private MysqlHandler mysql;

    @Override
    public void onEnable() {
        getLogger().info("Connecting to the database");
        connectToDatabase();
        getLogger().info("Connected to the database.");

        getLogger().info("Registering Handlers.");
        registerHandlers();
        getLogger().info("Registered Handlers.");
    }

    private void connectToDatabase() {
        mysql = new MysqlHandler();
        mysql.connect("localhost", 3306, "minefever", "root", "");
    }

    private void registerHandlers() {
        getServer().getPluginManager().registerEvents(new OnUserLogin(), this);
    }

    @Override
    public void onDisable() {

    }
}
