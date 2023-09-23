package db;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.sql.*;

public class DB {
    private final static String DB_URL = "jdbc:postgresql://localhost:5432/habrdb";
    private final static String USER = "habrpguser";
    private final static String PASS = "pgpwd4habr";

    static Statement statement = null;

    @BeforeMethod
    public void before() throws SQLException {
        // SQL CONNECT
        System.out.println("Test connection to Driver");

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Error connect to driver");
            throw new RuntimeException();
        }

        System.out.println("We successfully connected to driver");

        Connection connection = null;

        try {
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException e) {
            System.out.println("Fail to get connection");
            throw new RuntimeException(e);
        }

        if (connection != null) {
            System.out.println("We successfully get connection");
        } else {
            System.out.println("Fail to get connection");
        }
        statement = connection.createStatement();
    }


    @Test
    void createAndDeleteUser() {
        try {
            statement.executeUpdate("INSERT INTO USERS (username, age) VALUES ('Petro',21)");
            System.out.println("The person Alice added successfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try {
            statement.execute("DELETE FROM USERS WHERE username = 'Petro' ");
            System.out.println("The person deleted successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String username = "";
        try {

            ResultSet rs = statement.executeQuery("SELECT * FROM USERS WHERE username like 'Petro'");

            while (rs.next()) {
                username = rs.getString("username");
                int age = rs.getInt("age");
                System.out.println(username);
                System.out.println(age);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        assertThat(username).isEqualTo("");
    }

    @Test
    void createAndUpdateUser() {
        try {
            statement.executeUpdate("INSERT INTO USERS (username, age) VALUES ('Robert',10)");
            System.out.println("The person added successfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try {
            statement.execute("UPDATE USERS SET username = 'Magda' WHERE username = 'Robert' ");
            System.out.println("The person successfully update");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String username = "Magda";
        try {

            ResultSet rs = statement.executeQuery("SELECT * FROM USERS WHERE username like 'Magda'");

            while (rs.next()) {
                username = rs.getString("username");
                int age = rs.getInt("age");
                System.out.println(username);
                System.out.println(age);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        assertThat(username).isEqualTo("Magda");

    }
}
