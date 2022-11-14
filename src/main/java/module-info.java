module com.example.runlater {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.runlater to javafx.fxml;
    exports com.example.runlater;
}