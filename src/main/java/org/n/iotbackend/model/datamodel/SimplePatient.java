package org.n.iotbackend.model.datamodel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class SimplePatient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID uuid;
    private String treatingDoctorUUID;

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getTreatingDoctorUUID() {
        return treatingDoctorUUID;
    }

    public void setTreatingDoctorUUID(String treatingDoctorUUID) {
        this.treatingDoctorUUID = treatingDoctorUUID;
    }
}
