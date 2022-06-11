package com.example.sudoku;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import java.sql.*;

import java.net.URL;
import java.util.ResourceBundle;

public class SudokuController implements Initializable, MainStateHolder{

    @FXML
    private Button easyButton;
    @FXML
    private Button mediumButton;
    @FXML
    private Button hardButton;
    @FXML
    private TextField userName;

    private MainState mainState;

    private Connection connection;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {



    }


    @FXML
    protected void onEasyButtonClick(ActionEvent actionEvent) {

        //check if user of given username exists, if not add him to the database


        //check if the user has already done this sudoku

    }

    @FXML
    public void onHardButtonClick(ActionEvent actionEvent) {

        //check if user of given username exists, if not add him to the database

        //check if the user has already done this sudoku

    }

    @FXML
    public void onMediumButtonClick(ActionEvent actionEvent) {

        //check if user of given username exists, if not add him to the database

        //check if the user has already done this sudoku

    }

    @Override
    public void setMainState(MainState mainState) {

    }

    @Override
    public MainState getMainState() {
        return null;
    }

}