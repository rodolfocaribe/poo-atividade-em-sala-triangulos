module br.triangulos {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens br.triangulos to javafx.fxml;
    exports br.triangulos;
}