module nl.miwnn.ch17.johan.fxdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens nl.miwnn.ch17.johan.fxdemo to javafx.fxml;
    exports nl.miwnn.ch17.johan.fxdemo;
    exports nl.miwnn.ch17.johan.fxdemo.model;
    opens nl.miwnn.ch17.johan.fxdemo.model to javafx.fxml;
    exports nl.miwnn.ch17.johan.fxdemo.view;
    opens nl.miwnn.ch17.johan.fxdemo.view to javafx.fxml;
    exports nl.miwnn.ch17.johan.fxdemo.viewmodel;
    opens nl.miwnn.ch17.johan.fxdemo.viewmodel to javafx.fxml;
}