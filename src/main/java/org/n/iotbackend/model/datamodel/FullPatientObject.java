package org.n.iotbackend.model.datamodel;

import javax.persistence.Entity;

@Entity
public class FullPatientObject extends SimplePatient{

    private String firstName;
    private String secondName;
    // TODO: add the rest of the data needed for the record.

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
}
