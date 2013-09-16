package com.minefever.events;

import com.minefever.models.User;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;


/**
 * Created with IntelliJ IDEA.
 * User: xanrin
 * Date: 15/09/13
 * Time: 11:25
 * To change this template use File | Settings | File Templates.
 */
public class OnUserLogin implements Listener {
    @EventHandler
    public void normalLogin(PlayerLoginEvent event) {
        // Check if the user exists
        // if NOT then create an account
        // else continue
    }
}
