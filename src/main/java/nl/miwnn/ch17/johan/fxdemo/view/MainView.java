package nl.miwnn.ch17.johan.fxdemo.view;

/**
 * @author Johan Elzinga
 * Doel van de Class
 */
//package view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import nl.miwnn.ch17.johan.fxdemo.viewmodel.MainViewModel;


public class MainView {

    @FXML private TextField nameField;
    @FXML private Label nameLabel;

    private final MainViewModel viewModel = new MainViewModel();

    @FXML
    public void initialize() {
        // Binding tussen UI en ViewModel
        nameField.textProperty().bindBidirectional(viewModel.nameProperty());
        nameLabel.textProperty().bind(viewModel.displayedNameProperty());
    }
}
