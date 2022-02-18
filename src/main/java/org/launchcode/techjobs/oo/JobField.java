package org.launchcode.techjobs.oo;

public class JobField {
    private int id;
    private static int nextId;
    private String value;

    public JobField(){
        id = nextId;
        nextId++;
        value = "";
    }

    @Override
    public String toString() {
        return value;
    }


    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        JobField jobField = (JobField) object;

        if (id != jobField.id) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + id;
        return result;
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
