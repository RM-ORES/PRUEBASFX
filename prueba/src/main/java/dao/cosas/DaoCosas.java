package dao.cosas;

import domain.modelo.Cosa;

import java.util.List;

public class DaoCosas {
    private static List<Cosa> cosas;

    static { //CUTRE, SOLO PARA EL EXAMEN
        cosas = List.of(
                new Cosa("sjns", "sjsldk","jkff"),
                new Cosa("1232","435345","9665"),
                new Cosa("-----", "%%%%%", "@@@@@")
        );
    }
    public List<Cosa> getCosas(){
        return cosas;
    }
}
