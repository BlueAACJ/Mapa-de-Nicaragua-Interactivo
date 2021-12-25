package com.example.mapa;

// Importaciones de las herramientas que usaremos
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class Application extends javafx.application.Application {
    // Iniciamos la pantalla grafica
    @Override
    public void start(Stage stage){
        try {
            // Llamamos a la escena principal del proyecto
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("mapacompleto.fxml")));
            Scene scene = new Scene(root,1530,805);
            // Titulo de la escena
            stage.setTitle("Mapa Interactivo Por Alejandro Castillo");
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}
