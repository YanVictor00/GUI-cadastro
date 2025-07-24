package com.example.cadastrojavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    Stage windows;

    @Override
    public void start(Stage stage) throws Exception {

        windows = stage;

        Parent tela = FXMLLoader.load(getClass().getResource("telas/cliente.fxml"));

        Scene scene = new Scene(tela);

        windows.setScene(scene);

        windows.show();

    }
}
