package nl.miwnn.ch17.johan.fxdemo.model;

/**
 * @author Johan Elzinga
 *
 */

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {
    private static final String DEFAULT_TEXT = "Jantine, Johan, Simon";
    private final StringProperty name;

    public Person() {
        this.name = new SimpleStringProperty(DEFAULT_TEXT);
    }

    public StringProperty nameProperty() {
        return name;
    }

    public String getName() {
        return name.get();
    }

    public void setName(String name) {
        this.name.set(name);
    }
}
