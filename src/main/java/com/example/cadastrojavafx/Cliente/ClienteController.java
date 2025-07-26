package com.example.cadastrojavafx.Cliente;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import javafx.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class ClienteController implements Initializable {


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("Controller caregado!");
    }

    @FXML
    private ToggleGroup SEXO;

    @FXML
    private Button bt_deletar;

    @FXML
    private Button bt_editar;

    @FXML
    private Button bt_salvar;

    @FXML
    private RadioButton rb_f;

    @FXML
    private RadioButton rb_m;

    @FXML
    private TableColumn tc_id;

    @FXML
    private TableColumn tc_idade;

    @FXML
    private TableColumn tc_nome;

    @FXML
    private TableColumn tc_sexo;

    @FXML
    private TableColumn tc_tel;

    @FXML
    private TextField tf_idade;

    @FXML
    private TextField tf_nome;

    @FXML
    private TextField tf_tel;

    @FXML
    private TableView tv_clientes;


    @FXML
    void mostrarNome(ActionEvent event) {

        String nome = tf_nome.getText().toString();

        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        alert.setTitle("GAY");
        alert.setHeaderText("Parabéns, funcionou!");

        alert.setContentText(nome);

        alert.show();

    }


}
