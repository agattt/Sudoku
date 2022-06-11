package com.example.sudoku;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.sql.*;

import java.io.IOException;
import java.util.ResourceBundle;

public class SudokuApplication extends Application {

    @FXML
    private TextArea notification;

    private MainState mainState = new MainState();

    private Connection con;

    public static DataBase db;

    @Override
    public void start(Stage stage) throws IOException {

        db = new DataBase();

        db.prepareDb();

        //db.setConnection();

        FXMLLoader fxmlLoader = new FXMLLoader(SudokuApplication.class.getResource("background.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 550, 650);

        //MainController controller = fxmlLoader.getController();

        //controller.setMainState(mainState);

        stage.setTitle("Sudoku");
        stage.setScene(scene);
        stage.show();

        /*
        DataBase.prepareDb();
        try {
            Connection con = DataBase.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }

         */

    }

    public static void main(String[] args) {
        launch();
    }

}