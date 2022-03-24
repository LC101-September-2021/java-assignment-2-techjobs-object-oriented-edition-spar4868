package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Location extends JobField {
    private static int nextId = 1;
    @Override
    protected int getNextId(){
        return nextId++;
    }

    public Location() {
        super();
    }

    public Location(String value){
        this();
        setValue(value);
    }
}
