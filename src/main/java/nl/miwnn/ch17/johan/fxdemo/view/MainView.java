package nl.miwnn.ch17.johan.fxdemo.view;

/**
 * @author Johan Elzinga
 * Doel van de Class
 */
//package view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import nl.miwnn.ch17.johan.fxdemo.viewmodel.MainViewModel;


public class MainView {

    @FXML private TextField nameField;
    @FXML private Label nameLabel;
    @FXML private Label startLabel;

    private final MainViewModel viewModel = new MainViewModel();

    @FXML
    public void initialize() {
        // Opmaak
        nameField.setMaxWidth(600);
        nameField.setFont(new Font("Arial", 30));
        nameLabel.setFont(new Font("Arial", 30));
        nameLabel.setTextFill(Color.RED);
        startLabel.setFont(new Font("Arial", 30));



        // Binding tussen UI en ViewModel
        nameField.textProperty().bindBidirectional(viewModel.nameProperty());
        nameLabel.textProperty().bind(viewModel.displayedNameProperty());
    }
}
