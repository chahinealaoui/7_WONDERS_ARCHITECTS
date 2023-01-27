module com.example.wondersarchitects {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.wondersarchitects to javafx.fxml;
    exports com.example.wondersarchitects;
}