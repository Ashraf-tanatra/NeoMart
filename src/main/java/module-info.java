module com.example.neomart {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.neomart to javafx.fxml;
    exports com.example.neomart;
}