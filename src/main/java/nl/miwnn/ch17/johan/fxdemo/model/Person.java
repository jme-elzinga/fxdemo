package nl.miwnn.ch17.johan.fxdemo.model;

/**
 * @author Johan Elzinga
 * Doel van de Class
 */

//package model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {
    private final StringProperty name = new SimpleStringProperty("");

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
