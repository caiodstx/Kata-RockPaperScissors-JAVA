package com.factoriaf5.rps.domain.models;

import com.factoriaf5.rps.domain.contracts.InterfaceObject;

public class Paper implements InterfaceObject {

    public String name = "Paper";

    public Paper() {
    }

    public Paper(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
