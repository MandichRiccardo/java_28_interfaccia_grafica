module com.example.java_28_interfaccia_grafica {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java_28_interfaccia_grafica to javafx.fxml;
    exports com.example.java_28_interfaccia_grafica;
}