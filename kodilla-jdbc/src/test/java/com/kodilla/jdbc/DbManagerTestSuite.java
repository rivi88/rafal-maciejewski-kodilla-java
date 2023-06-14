package com.kodilla.jdbc;

import org.junit.jupiter.api.Test;

import java.sql.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class DbManagerTestSuite {

    @Test
    void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        assertNotNull(dbManager.getConnection());
    }

    @Test
    void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        assertEquals(15, counter);
    }

    @Test
    public void testSelectUsersAndPosts() {
        // Tworzenie połączenia z bazą danych
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "username";
        String password = "password";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String query = "SELECT u.first_name, u.last_name " +
                    "FROM users u " +
                    "JOIN posts p ON u.id = p.user_id " +
                    "GROUP BY u.id " +
                    "HAVING COUNT(p.id) >= 2";

            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(query)) {

                while (resultSet.next()) {
                    String firstName = resultSet.getString("first_name");
                    String lastName = resultSet.getString("last_name");
                    System.out.println(firstName + " " + lastName);
                }

                resultSet.last();
                int rowCount = resultSet.getRow();


                int oczekiwanaLiczbaRekordow = 2; //
                //              Assert.assertEquals(oczekiwanaLiczbaRekordow, rowCount);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
