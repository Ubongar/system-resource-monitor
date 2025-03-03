module com.clones.systemresourcemonitor {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.management;


    opens com.clones.systemresourcemonitor to javafx.fxml;
    exports com.clones.systemresourcemonitor;
}