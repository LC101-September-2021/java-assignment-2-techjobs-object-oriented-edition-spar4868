package org.launchcode.techjobs.oo;

abstract class JobField {
    private String value;
    private int id;

    protected abstract int getNextId();

    public JobField(){
        id = getNextId();
    }

    public JobField(String valueIn){
        this();
        value = valueIn;

    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JobField jobField = (JobField) o;

        return getId() == jobField.getId();
    }

    @Override
    public int hashCode() {
        return getId();
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
