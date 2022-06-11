package com.example.sudoku;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.sql.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class DataBaseController {

    //DO USUNIĘCIA PROBABLY

    ObservableList<User> data = FXCollections.observableArrayList();

    @FXML
    private TextField userName;
    private Stage stage;
    private Scene scene;

    @FXML
    public static void createDB() {

        try {

            Connection con = DataBase.getConnection();

            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM USERS");

            while (rs.next()) {

                User obj = new User(
                        rs.getString("NAME"),
                        rs.getString("EASY1"),
                        rs.getString("MEDIUM1"),
                        rs.getString("HARD1"));

            }

        } catch (SQLException exception) {

            System.out.println("Problem z utworzeniem bazy danych na początku");
        }
    }

    @FXML
    public void onEasyButtonClick(ActionEvent event) throws SQLException {

        Connection c = DataBase.getConnection();
        try (PreparedStatement st = c.prepareStatement("SELECT * FROM USERS WHERE NAME = ?")){
            st.setString(1,userName.getText());
            ResultSet rs = st.executeQuery();
            if (rs != null){
                try (PreparedStatement stm = c.prepareStatement("SELECT EASY1 FROM rs;")){
                    ResultSet rst = stm.executeQuery();
                    if (rst != null) {
                        Parent root = null;
                        try {
                            root = FXMLLoader.load(getClass().getResource("easy-board.fxml"));
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        scene = new Scene(root);
                        stage.setScene(scene);
                        stage.show();
                    }
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
