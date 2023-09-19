package ui.pantallas.listado;

import domain.modelo.Cosa;
import domain.usecases.cosas.ListadoUseCase;
import jakarta.inject.Inject;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import ui.pantallas.common.BasePantallaController;

public class ListadoController extends BasePantallaController {
    @FXML
    private TableColumn<Cosa, String> colCosa;
    @FXML
    private TableColumn<Cosa, String> colOtraCosa;

    @FXML
    private TableColumn<Cosa, String> colAquellaCosa;
    @FXML
    private TableView<Cosa> tabla;

    private ListadoUseCase listadoUseCase;

    @Inject
    public ListadoController(ListadoUseCase listadoUseCase) {
        this.listadoUseCase = listadoUseCase;
    }

    public void initialize() {
        colCosa.setCellValueFactory(new PropertyValueFactory<>("cosa"));
        colOtraCosa.setCellValueFactory(new PropertyValueFactory<>("otracosa"));
        colAquellaCosa.setCellValueFactory(new PropertyValueFactory<>("aquellacosa"));


        tabla.getItems().addAll(listadoUseCase.getlistado());
    }
}
