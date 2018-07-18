/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quinielaapp;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Gabriel
 */
public class LoginController implements Initializable {

    @FXML
    private PasswordField txtPassword;
    @FXML
    private TextField txtUser;
    @FXML
    private Label lblStatus;


    public void irRegistro(ActionEvent event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("Registro.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        //Esta linea toma la informacion del Stage
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();
    }

    public void logIn(ActionEvent event) throws IOException {
        if (txtUser.getText().equals("usuario") && txtPassword.getText().equals("pass")) {
            lblStatus.setText("Credenciales aceptados");

            Parent tableViewParent = FXMLLoader.load(getClass().getResource("Landing.fxml"));
            Scene tableViewScene = new Scene(tableViewParent);

            //Esta linea toma la informacion del Stage
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

            window.setScene(tableViewScene);
            window.show();
        } else {
            lblStatus.setText("¡Acceso denegado! Revise sus credenciales.");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}
