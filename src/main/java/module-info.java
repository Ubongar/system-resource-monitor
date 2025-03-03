module com.clones.systemresourcemonitor {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.clones.systemresourcemonitor to javafx.fxml;
    exports com.clones.systemresourcemonitor;
}