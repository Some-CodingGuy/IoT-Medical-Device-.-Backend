package org.n.iotbackend.controller.service;

import org.n.iotbackend.model.datamodel.FullPatientObject;
import org.n.iotbackend.model.repositories.FullPatientObjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class FullPatientObjectService {

    @Autowired
    FullPatientObjectRepository fullPatientObjectRepository;

    public List<FullPatientObject> getAllPatiensWithFullDetails(){
        return fullPatientObjectRepository.findAll();
    }

    public FullPatientObject getPatientWithUuid(UUID uuid){
        return fullPatientObjectRepository.getOne(uuid);
    }

    public boolean savePatientToDatabase(FullPatientObject fullPatientObject){

        if(fullPatientObject != null) {
            fullPatientObjectRepository.save(fullPatientObject);
            return true;
        }
        else return false;
    }



}
