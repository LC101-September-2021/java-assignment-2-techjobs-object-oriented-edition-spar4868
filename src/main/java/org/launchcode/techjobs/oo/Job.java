package org.launchcode.techjobs.oo;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Job extends JobField{

    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;
    private int id;
    private static int nextId = 1;
    @Override
    protected int getNextId(){
        return nextId++;
    }
    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.



    public Job(){
        id = nextId;
        employer = new Employer();
        location = new Location();
        positionType = new PositionType();
        coreCompetency = new CoreCompetency();
    }


    public Job(String nameIn, Employer employerIn, Location locationIn, PositionType positionTypeIn, CoreCompetency coreCompetencyIn) {
        this();
        setValue(nameIn);
        setEmployer(employerIn);
        setLocation(locationIn);
        setPositionType(positionTypeIn);
        setCoreCompetency(coreCompetencyIn);
    }

    // TODO: toStringMethod and check for empty
    private String isEmpty(String stringIn){
        if(stringIn == null || stringIn.equals("")){
            return "Data not available";
        }
        else {
            return stringIn;
        }
    }

    @Override
    public String toString(){
        if (getValue() == null || getValue().equals("")){
            setValue("Data not available");
        }
        if (employer.getValue() == null ||  employer.getValue().equals("")){
            employer.setValue("Data not available");
        }
        if (location.getValue() == null || location.getValue().equals("")){
            location.setValue("Data not available");
        }
        if (positionType.getValue() == null || positionType.getValue().equals("")){
            positionType.setValue("Data not available");
        }
        if (coreCompetency.getValue() == null || coreCompetency.getValue().equals("")){
            coreCompetency.setValue("Data not available");
        }

        String stringOut = String.format("\nID: %d\n" + "Name: %s\n" + "Employer: %s\n" + "Location: %s\n" + "Position Type: %s\n" + "Core Competency: %s\n", id, getValue(), employer, location, positionType, coreCompetency);
        return stringOut;
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public String getName() {
        return getValue();
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    @Override
    public int getId(){
        return this.id;
    }



    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public void setName(String newName){
        setValue(newName);
    }
}
