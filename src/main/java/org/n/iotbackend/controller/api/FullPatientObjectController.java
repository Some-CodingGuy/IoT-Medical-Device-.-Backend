package org.n.iotbackend.controller.api;

import org.n.iotbackend.controller.service.FullPatientObjectService;
import org.n.iotbackend.model.datamodel.FullPatientObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/patient/fulldata")
public class FullPatientObjectController {

    private FullPatientObjectService fullPatientObjectService;

    @Autowired
    public FullPatientObjectController(FullPatientObjectService fullPatientObjectService){
        this.fullPatientObjectService = fullPatientObjectService;
    }

    /**
     * When a GET request is made to the api url, a list with all the patients is returned
     * @return
     */
    @GetMapping
    public List<FullPatientObject> getAllPatients(){
        return fullPatientObjectService.getAllPatiensWithFullDetails();
    }

    /**
     * Get the patient with the give uuid
     * @param uuid
     * @return
     */
    @GetMapping(path = "{id}")
    public FullPatientObject getPatientWithUuid(@PathVariable("{id}") UUID uuid){
        return fullPatientObjectService.getPatientWithUuid(uuid);
    }

    /**
     * Save the given patient object to the database
     * @param patient
     */
    @PostMapping
    public void savePatientToDatabase(@RequestBody FullPatientObject patient){
        fullPatientObjectService.savePatientToDatabase(patient);
    }

}
