package org.n.iotbackend.model.datamodel;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class FullPatientObject extends SimplePatient{

    private String firstName;
    private String secondName;
    private Date birthdate;
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

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
}
