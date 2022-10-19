module br.triangulos {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens br.triangulos to javafx.fxml;
    exports br.triangulos;
}