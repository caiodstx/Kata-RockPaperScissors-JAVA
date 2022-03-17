package com.factoriaf5.rps.domain.models;

import com.factoriaf5.rps.domain.contracts.InterfaceObject;

public class ObjectFactory {

    public ObjectFactory() {
    }

    public InterfaceObject createObject(String Object) {

        if (Object == null) {
            return null;
        }

        if (Object.equals("Paper")) {
            return new Paper();
        }

        if (Object.equals("Rock")) {
            return new Rock();
        }

        if (Object.equals("Scissors")) {
            return new Scissors();
        }
        return null;

    }
}
