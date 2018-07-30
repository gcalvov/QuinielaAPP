/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quinielaapp;

import gestores.GestorUsuario;
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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Gabriel
 */
public class RegistroController implements Initializable {

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtApellido;

    @FXML
    private TextField txtAvatar;

    @FXML
    private TextField txtNomUsuario;

    @FXML
    private TextField txtCorreol;

    @FXML
    private TextField txtPassword1;

    @FXML
    private TextField txtPassword2;

    @FXML
    private Label lblEstatus;

    @FXML
    private Button btnRegistrar;

    public void regresarLogin(ActionEvent event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        //Esta linea toma la informacion del Stage
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void registrarUsuarios(ActionEvent event) throws IOException {
        GestorUsuario miGestor = new GestorUsuario();
        boolean existe = true;
        existe = miGestor.verificarUsuario(txtCorreol.getText());

        if (existe) {
            lblEstatus.setText("Ya el usuario Existe!");
        }

        if (txtPassword1.getText().equals(txtPassword2.getText()) && (existe == false)) {
            String nombre;
            String apellido;
            String correo;
            String contrasenha;
            String avatar;
            String nombreUsuario;

            nombre = txtNombre.getText();
            apellido = txtApellido.getText();
            correo = txtCorreol.getText();
            contrasenha = txtPassword1.getText();
            avatar = txtAvatar.getText();
            nombreUsuario = txtNomUsuario.getText();

            miGestor.registrarUsuario(correo, contrasenha, "usuario", nombre, apellido, avatar, nombreUsuario);
            lblEstatus.setText("Usuario registrado exitosamente!");

            Parent tableViewParent = FXMLLoader.load(getClass().getResource("Login.fxml"));
            Scene tableViewScene = new Scene(tableViewParent);

            //Esta linea toma la informacion del Stage
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

            window.setScene(tableViewScene);
            window.show();

        } else {
            lblEstatus.setText("Verifique datos!");
        }

    }

}
