package com.minefever.handlers;

import java.sql.*;

/**
 * Created with IntelliJ IDEA.
 * User: xanrin
 * Date: 15/09/13
 * Time: 11:24
 * To change this template use File | Settings | File Templates.
 */
public class MysqlHandler {
    private static String connectString = "jdbc:mysql://localhost/minefever?user=root&password=";
    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    public MysqlHandler(String host, int port, String database, String username, String password) {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            connect = DriverManager.getConnection(String.format("jdbc:mysql://%s:%d/%s?user=%s&password=&s", host, port, database, username, password));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public Connection getConnect() {
        if (connect != null) {
            return connect;
        }

        return null;
    }

    public void setConnect(Connection connect) {
        this.connect = connect;
    }
}
