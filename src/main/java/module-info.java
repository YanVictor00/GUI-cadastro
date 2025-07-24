module com.example.cadastrojavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cadastrojavafx to javafx.fxml;

    exports com.example.cadastrojavafx to javafx.graphics;
}
