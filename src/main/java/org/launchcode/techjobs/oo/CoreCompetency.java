package org.launchcode.techjobs.oo;

import java.util.Objects;

public class CoreCompetency extends JobField {
    private static int nextId = 1;
    @Override
    protected int getNextId(){
        return nextId++;
    }


    public CoreCompetency() {
        super();
    }

    public CoreCompetency(String value) {
        this();
        setValue(value);
    }
}
