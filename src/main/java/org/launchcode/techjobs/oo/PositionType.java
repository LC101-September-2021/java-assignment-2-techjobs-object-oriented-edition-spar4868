package org.launchcode.techjobs.oo;

public class PositionType extends JobField {
    private static int nextId = 1;
    @Override
    protected int getNextId(){
        return nextId++;
    }

    public PositionType() {
        super();
    }

    public PositionType(String value) {
        this();
        setValue(value);
    }
}
