package com.minefever.models;

import com.avaje.ebean.validation.NotNull;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.*;
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

    public static boolean userExists(Connection conn, String name) {
        String query = "SELECT username FROM user WHERE username = ?";

        Statement statement = null;

        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, name);

            ResultSet rs = ps.executeQuery();

            // If we got a result then the account exists
            if (rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    public static boolean createUser(Connection conn, String name) {
        String query = "INSERT INTO user (`username`, `vp`, `dp`) VALUES (?, ?, ?)";

        Statement statement = null;

        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setInt(2, 0);
            ps.setInt(3, 0);

            int rows = ps.executeUpdate();

            // If we got a result then the account exists
            if (rows > 0) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
}
