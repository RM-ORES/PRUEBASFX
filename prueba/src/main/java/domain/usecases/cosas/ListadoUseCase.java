package domain.usecases.cosas;

import dao.cosas.DaoCosas;
import domain.modelo.Cosa;
import jakarta.inject.Inject;

import java.util.List;

public class ListadoUseCase {
    private DaoCosas daoCosas;

    @Inject
    public ListadoUseCase(DaoCosas daoCosas) {
        this.daoCosas = daoCosas;
    }



    public List<Cosa> getlistado(){
        return daoCosas.getCosas();
    }
}
