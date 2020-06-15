package me.yoogle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Application {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/springdata";
        String username = "yoogle";
        String pass = "pass";

        try(Connection connection = DriverManager.getConnection(url, username, pass)) {
            String sql = "INSERT INTO ACCOUNT VALUES(1, 'yoogle', 'pass')";
            try(PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.execute();
            }
        }
    }
}
