package com.example.orderingsystem;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class HelloController {


    @FXML
    public void handleBurgerClick(javafx.scene.input.MouseEvent mouseEvent) {
        try {
            Parent burgerRoot = FXMLLoader.load(getClass().getResource("Burgers.fxml"));
            Scene scene = ((Node) mouseEvent.getSource()).getScene();
            scene.setRoot(burgerRoot);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void handleBreakfastClick(MouseEvent mouseEvent) {
        try {
            Parent burgerRoot = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
            Scene scene = ((Node) mouseEvent.getSource()).getScene();
            scene.setRoot(burgerRoot);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void handleSpagClick(MouseEvent mouseEvent) {
        try {
            Parent burgerRoot = FXMLLoader.load(getClass().getResource("Spag.fxml"));
            Scene scene = ((Node) mouseEvent.getSource()).getScene();
            scene.setRoot(burgerRoot);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}