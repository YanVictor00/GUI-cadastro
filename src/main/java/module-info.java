module com.example.cadastrojavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    opens com.example.cadastrojavafx to javafx.fxml;

    opens com.example.cadastrojavafx.Cliente to javafx.fxml;

    exports com.example.cadastrojavafx to javafx.graphics;
}
