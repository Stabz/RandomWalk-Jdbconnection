/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bruger
 */
public class DB_Connection {

    private static String insertstuffhere ="recycling";
    
    private static Connection con = null;

    private static final String DRIVER = "org.postgresql.Driver";

    public static final String URL = "jdbc:postgresql://localhost:5432/"+insertstuffhere+"";

    private static final String USER = "postgres";

    private static final String PSSWRD = "12befa";

    public static Connection connect() {
        System.out.println("test på forbindelse");
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            System.out.println("JDBC is missing");
        }
        System.out.println("postgreSQL er registreret");

        try {
            con = DriverManager.getConnection(URL, USER, PSSWRD);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        if (con != null) {
            System.out.println("godt gået");
        } else {
            System.out.println("epic fail");

        }
        return con;
    }

    public void closeConnection() {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            System.out.println("connection is closed.");
        }
    }
}
