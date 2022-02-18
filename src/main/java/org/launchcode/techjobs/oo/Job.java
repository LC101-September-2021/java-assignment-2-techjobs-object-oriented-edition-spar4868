package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job extends JobField{


    private Employer employer = new Employer();
    private Location location = new Location();
    private PositionType positionType = new PositionType();
    private CoreCompetency coreCompetency = new CoreCompetency();

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job(){
        super();
    }

    public Job(String nameIn, Employer employerIn, Location locationIn, PositionType positionTypeIn, CoreCompetency coreCompetencyIn){
        this();
        this.setValue(nameIn);
        setEmployer(employerIn);
        setLocation(locationIn);
        setPositionType(positionTypeIn);
        setCoreCompetency(coreCompetencyIn);
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        Job job = (Job) object;

        if (this.getId() != job.getId()) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + this.getId();
        return result;
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public String getName() {
        return this.getValue();
    }

    public void setName(String name) { this.setValue(name);
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }


    private String isEmpty(String stringIn){
        if( stringIn.equals("")){
            return "Data not available";
        }
        else {
            return stringIn;
        }
    }
    public String toString(){
        return String.format("ID: %s\nName: %s\nEmployer: %s\nLocation: %s\nPosition Type: %s\nCore Competency: %s", this.getId(), isEmpty(this.getName()),isEmpty(employer.getValue()), isEmpty(location.getValue()), isEmpty(positionType.getValue()), isEmpty(coreCompetency.getValue()));
    }
}
