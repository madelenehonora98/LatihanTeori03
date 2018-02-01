/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madelene.controller;

import com.madelene.MainApp;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Madelene
 */
public class MainFormController implements Initializable {

    @FXML
    private BorderPane borderPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void btnAAct(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/FormA.fxml"));
            AnchorPane pane = loader.load();
            Scene scene = new Scene(pane);
            Stage StageA = new Stage();
            StageA.setScene(scene);
            StageA.setTitle("Form A");
            StageA.initOwner(borderPane.getScene().getWindow());
            StageA.initModality(Modality.APPLICATION_MODAL);
            StageA.show();
        } catch (IOException ex) {
            Logger.getLogger(MainFormController.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void btnBAct(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/FormB.fxml"));
            AnchorPane pane = loader.load();
            Scene scene = new Scene(pane);
            Stage StageB = new Stage();
            StageB.setScene(scene);
            StageB.setTitle("Form B");
            StageB.initOwner(borderPane.getScene().getWindow());
            StageB.initModality(Modality.WINDOW_MODAL);
            StageB.show();
        } catch (IOException ex) {
            Logger.getLogger(MainFormController.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void btnCAct(ActionEvent event) {
    }

}
