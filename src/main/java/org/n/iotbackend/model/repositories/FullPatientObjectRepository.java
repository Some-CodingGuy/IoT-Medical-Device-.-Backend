package org.n.iotbackend.model.repositories;

import org.n.iotbackend.model.datamodel.FullPatientObject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FullPatientObjectRepository extends JpaRepository<FullPatientObject, UUID> {
}
