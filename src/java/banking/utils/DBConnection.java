package banking.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class DBConnection {

    private static final String DB_HOST = "jdbc:mysql://csproject.sit.kmutt.ac.th:3306/csc105_61130500220";
    private static final String DB_USERNAME = "61130500220";
    private static final String DB_PASSWORD = "AaiC9289";

    public static Connection getMySQLConnection() throws Exception {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            
            Connection conn = DriverManager.getConnection(DB_HOST, DB_USERNAME, DB_PASSWORD);
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
