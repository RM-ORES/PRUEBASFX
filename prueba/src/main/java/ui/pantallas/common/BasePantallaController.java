package ui.pantallas.common;

import ui.pantallas.principal.PrincipalController;


public abstract class BasePantallaController {

    private PrincipalController principalController;

    public PrincipalController getPrincipalController() {
        return principalController;
    }

    public void setPrincipalController(PrincipalController principalController) {
        this.principalController = principalController;
    }

    /* lo usamos para no arrancar cosas hasta que no este todo cargado*/
    public void principalCargado() {}
}
