module com.example.cadastrojavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.cadastrojavafx to javafx.fxml;
    exports com.example.cadastrojavafx;
}