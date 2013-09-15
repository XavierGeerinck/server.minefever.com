package com.minefever.models;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: xanrin
 * Date: 15/09/13
 * Time: 11:25
 * To change this template use File | Settings | File Templates.
 */
public class User {
    private final int id;
    private String username;
    private int dp;
    private int vp;
    private final String dateCreated;

    public User() {
        this.id = 0;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
        this.dateCreated = dateFormat.format(new Date());
        this.dp = 0;
        this.vp = 0;
        this.username = "";
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getDp() {
        return dp;
    }

    public void setDp(int dp) {
        this.dp = dp;
    }

    public int getVp() {
        return vp;
    }

    public void setVp(int vp) {
        this.vp = vp;
    }

    public String getDateCreated() {
        return dateCreated;
    }
}
