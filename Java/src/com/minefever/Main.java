package com.minefever;

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
        mysql = new MysqlHandler();
        mysql.connect("localhost", 3306, "minefever", "root", "");
    }

    @Override
    public void onDisable() {

    }
}
