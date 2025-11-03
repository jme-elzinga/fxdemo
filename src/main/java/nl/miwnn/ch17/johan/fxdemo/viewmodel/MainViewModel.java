package nl.miwnn.ch17.johan.fxdemo.viewmodel;

/**
 * @author Johan Elzinga
 * Doel van de Class
 */


//package viewmodel;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import nl.miwnn.ch17.johan.fxdemo.model.Person;


public class MainViewModel {

    private final Person person = new Person();
    private final StringProperty displayedName = new SimpleStringProperty();

    public MainViewModel() {
        // Binding tussen person.name en displayedName
        displayedName.bind(person.nameProperty());
    }

    public StringProperty nameProperty() {
        return person.nameProperty();
    }

    public StringProperty displayedNameProperty() {
        return displayedName;
    }
}
