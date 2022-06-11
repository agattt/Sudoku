package com.example.sudoku;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class MainController {

    @FXML
    private AnchorPane contents;

    private MainState mainState;

    public void onEasyButtonClick(ActionEvent actionEvent) {

        //check if user of given username exists, if not add him to the database



        //check if the user has already done this sudoku

        //else:

        loadAsMainContent("easy-board.fxml");

    }

    public void onMediumButtonClick(ActionEvent actionEvent) {

        //check if user of given username exists, if not add him to the database



        //check if the user has already done this sudoku

        //else:

        loadAsMainContent("medium-board.fxml");

    }

    public void onHardButtonClick(ActionEvent actionEvent) {

        //check if user of given username exists, if not add him to the database



        //check if the user has already done this sudoku

        //else:

        loadAsMainContent("hard-board.fxml");

    }

    public void showWelcomeScreen(ActionEvent actionEvent) {

        loadAsMainContent("welcome-screen.fxml");

    }

    private void loadAsMainContent(String name) {

        FXMLLoader fxmlLoader = new FXMLLoader(SudokuApplication.class.getResource(name));

        try {

            Pane root = fxmlLoader.load();
            MainStateHolder controller = fxmlLoader.getController();
            controller.setMainState(mainState);
            contents.getChildren().clear();
            contents.getChildren().add(root);

        } catch (IOException e) {

            throw new RuntimeException(e);

        }
    }

    public void setMainState(MainState mainState) {

        this.mainState = mainState;

        showWelcomeScreen(null);

    }

    public MainState getGameState() {
        return mainState;
    }

}
