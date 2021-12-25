module com.example.mapa {
    requires javafx.controls;
    requires javafx.fxml;

        requires org.controlsfx.controls;

    opens com.example.mapa to javafx.fxml;
    exports com.example.mapa;
}