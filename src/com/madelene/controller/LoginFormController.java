/*
Nama: Madelene Honora
Nrp : 1672024
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
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Madelene
 */
public class LoginFormController implements Initializable {

    @FXML
    private TextField txtusername;
    @FXML
    private PasswordField txtpassword;
    @FXML
    private AnchorPane anchorPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void btnLoginAction(ActionEvent event) {
        if (txtusername.getText().trim().isEmpty() || txtpassword.getText().
                isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please fill all field");
            alert.showAndWait();
        } else if (txtusername.getText().trim().equals("1672024")
                && txtpassword.getText().equals("Madelene")) {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(MainApp.class.getResource(
                        "view/MainForm.fxml"));
                BorderPane pane = loader.load();
                Scene scene = new Scene(pane);
                Stage secondStage = new Stage();
                secondStage.setScene(scene);
                secondStage.setTitle("Main Form");
                secondStage.show();

                //Close login stage
                anchorPane.getScene().getWindow().hide();
            } catch (IOException ex) {
                Logger.getLogger(LoginFormController.class.getName()).
                        log(Level.SEVERE, null, ex);
            }
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Invalid username or password");
            alert.showAndWait();
        }

//        System.out.println(txtusername.getText());
//        System.out.println(txtpassword.getText());
    }

}
