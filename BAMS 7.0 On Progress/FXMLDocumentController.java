/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxtest07;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author Rakeeb
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private BorderPane mainScene;
    
    private boolean softwareUserVerificatiob = false;
    
    @FXML
    private Button closeButton;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
    
    @FXML
    private void login(ActionEvent event) {
        softwareUserVerificatiob = true;
    }
    
    @FXML
    private void registrationPane(ActionEvent event) throws IOException {
        if(softwareUserVerificatiob){
            Parent registrationPane = FXMLLoader.load(getClass().getResource("Registration.fxml"));
            mainScene.setRight(registrationPane);
        }
    }

    @FXML
    private void depositePanel(ActionEvent event) throws IOException {
        if(softwareUserVerificatiob){
            Parent depositePane = FXMLLoader.load(getClass().getResource("Deposite.fxml"));
            mainScene.setRight(depositePane);
        }
    }

    @FXML
    private void withdrawPanel(ActionEvent event) throws IOException {
        if(softwareUserVerificatiob){
            Parent withdrawPane = FXMLLoader.load(getClass().getResource("Withdraw.fxml"));
            mainScene.setRight(withdrawPane);
        }
    }

    @FXML
    private void transferPanel(ActionEvent event) throws IOException {
        if(softwareUserVerificatiob){   
            Parent transferPane = FXMLLoader.load(getClass().getResource("Transfer.fxml"));
            mainScene.setRight(transferPane);
        }
    }

    @FXML
    private void userDetailsPane(ActionEvent event) throws IOException {
        if(softwareUserVerificatiob){
            Parent userDetailsPane = FXMLLoader.load(getClass().getResource("UserDetails.fxml"));
            mainScene.setRight(userDetailsPane);
        }
    }

    @FXML
    private void closeAppicationBtn(ActionEvent event) {
        if(softwareUserVerificatiob){
            Stage stage = (Stage) closeButton.getScene().getWindow();
            stage.close();
        }
    }
}
