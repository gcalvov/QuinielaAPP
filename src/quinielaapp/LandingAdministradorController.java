/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quinielaapp;

import cl.*;
import gestores.*;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Gabriel
 */
public class LandingAdministradorController implements Initializable {

    @FXML
    private TableView<Equipo> tableView;
    @FXML
    private TableColumn<Equipo, String> isoColumn;
    @FXML
    private TableColumn<Equipo, String> nombreColumn;
    @FXML
    private TableColumn<Equipo, String> rankingColumn;

    @FXML
    Button btnSalir;

    @FXML
    Button btnActualizar;

    @FXML
    Button btnRegistrar;

    @FXML
    private TextField txtISO;
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtRanking;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        isoColumn.setCellValueFactory(new PropertyValueFactory<Equipo, String>("iso"));
        nombreColumn.setCellValueFactory(new PropertyValueFactory<Equipo, String>("nombre"));
        rankingColumn.setCellValueFactory(new PropertyValueFactory<Equipo, String>("rankinFIFA"));

        tableView.setItems(getEquipos());

        tableView.setEditable(true);

        btnActualizar.setVisible(false);

    }

    public void nuevoEquipo() {
        Equipo equipoNuevo = new Equipo(txtISO.getText(), txtNombre.getText(), Integer.parseInt(txtRanking.getText()));
        // tomar todos los items de la tabla
        tableView.getItems().add(equipoNuevo);
        txtISO.setText("");
        txtNombre.setText("");
        txtRanking.setText("");

    }

    // Metodo para borrar lineas
    public void deleteEquipo() {
        ObservableList<Equipo> selectedRows, allTeams;
        allTeams = tableView.getItems();
        selectedRows = tableView.getSelectionModel().getSelectedItems();

        for (Equipo x : selectedRows) {
            allTeams.remove(x);
        }
    }

    public void actualizarEquipo() {
        btnActualizar.setVisible(false);
        btnRegistrar.setVisible(true);
        Equipo selectedRow = tableView.getSelectionModel().getSelectedItem();

        Equipo equipoActualizado = new Equipo(txtISO.getText(), txtNombre.getText(), Integer.parseInt(txtRanking.getText()));

        tableView.getItems().remove(selectedRow);
        tableView.getItems().add(equipoActualizado);

        txtISO.setText("");
        txtNombre.setText("");
        txtRanking.setText("");

    }

    public void cancelar() {
        txtISO.setText("");
        txtNombre.setText("");
        txtRanking.setText("");
    }

    public ObservableList<Equipo> getEquipos() {

//        ObservableList<Equipo> listaEquipos = FXCollections.observableArrayList();
//        listaEquipos.add(new Equipo("CRC", "Costa Rica", 12));
//        listaEquipos.add(new Equipo("BRA", "Brazil", 1));
//        listaEquipos.add(new Equipo("BEL", "Belgica", 3));
//        listaEquipos.add(new Equipo("MEX", "Mexico", 10));
//        listaEquipos.add(new Equipo("BRA", "Brazil", 1));
//        listaEquipos.add(new Equipo("BEL", "Belgica", 3));
//        listaEquipos.add(new Equipo("CRC", "Costa Rica", 12));
//        listaEquipos.add(new Equipo("BRA", "Brazil", 1));
//        listaEquipos.add(new Equipo("BEL", "Belgica", 3));
//
//        return listaEquipos;
//      usando mi estructura
        GestorEquipos miGestor = new GestorEquipos();
        ArrayList<Equipo> listaEquipos = miGestor.getListaEquipos();

        ObservableList<Equipo> lista = FXCollections.observableArrayList();

        for (Equipo x : listaEquipos) {
            lista.add(x);
        }

        return lista;
    }

    public void salirDelSistema(ActionEvent event) throws IOException {
        System.exit(0);
    }

    public void modificarEquipo(CellEditEvent celdaCambiar) {
        btnActualizar.setVisible(true);
        btnRegistrar.setVisible(false);

        Equipo selectedRow = tableView.getSelectionModel().getSelectedItem();
        txtISO.setText(selectedRow.getIso());
        txtNombre.setText(selectedRow.getNombre());
        txtRanking.setText(String.valueOf(selectedRow.getRankinFIFA()));

    }

}
