module javafx {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires MaterialFX;

    requires lombok;

    requires jakarta.inject;
    requires jakarta.cdi;
    requires retrofit2;
    requires okhttp3;
    requires io.reactivex.rxjava3;
    requires org.pdfsam.rxjavafx;


    //    requires rxjavafx;
//    requires org.pdfsam.rxjavafx;
    requires retrofit2.adapter.rxjava3;


    exports ui.main to javafx.graphics;
    exports ui.pantallas.principal;
    exports ui.pantallas.common;
    exports ui.pantallas.login;
    exports ui.pantallas.bienvenida;
    exports ui.pantallas.listado;

//    opens ui.pantallas.principal to javafx.fxml;


    opens ui.pantallas.principal;
    opens ui.pantallas.login to javafx.fxml;
    opens ui.pantallas.bienvenida to javafx.fxml;
    opens ui.pantallas.listado to javafx.fxml;
    opens ui.main;
    opens css;
    opens fxml;

}