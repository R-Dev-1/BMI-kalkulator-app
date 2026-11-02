module com.mycompany.bmicalc {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.bmicalc to javafx.fxml;
    exports com.mycompany.bmicalc;
}
