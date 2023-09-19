package ui.pantallas.login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import ui.pantallas.common.BasePantallaController;

import java.awt.*;

public class LoginController extends BasePantallaController {
    @FXML
    private TextField nombre;
    @FXML
    private void login(ActionEvent actionEvent) {
        getPrincipalController().onLogin(nombre.getText());
    }
}
