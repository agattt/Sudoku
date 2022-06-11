package com.example.sudoku;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Assertions;

import java.sql.*;

public class DataBase {

    private Connection connection;

    @BeforeAll
    public static void prepareDb() {

        try (Connection c = DriverManager.getConnection("jdbc:hsqldb:file:USERS", "SA", "")) {
            try (Statement st = c.createStatement()) {
                st.execute("CREATE TABLE IF NOT EXISTS USERS (NAME VARCHAR(20), EASY1 VARCHAR(5), MEDIUM1 VARCHAR(5), HARD1 VARCHAR(5))");
            }
        } catch (Exception e) {
            Assertions.fail(e);
        }

    }

    public static Connection getConnection() throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:hsqldb:file:USERS", "SA", "");

        return connection;

    }

    public static void dbDisconnect() throws SQLException {
        try {
            if (getConnection() != null && !getConnection().isClosed()) {
                getConnection().close();
            }
        } catch (Exception e){
            throw e;
        }
    }

    public void setConnection(){

        try {

            this.connection = DriverManager.getConnection("jdbc:hsqldb:file:USERS", "SA", "");


        } catch (Exception e) {

            throw new RuntimeException(e);

        }

    }

}
