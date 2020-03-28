package de.symptromtracker.backend.spring.repository;

import de.symptromtracker.backend.spring.web.api.model.SymptomJourneyModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SymptomJourneyRepository extends JpaRepository<SymptomJourneyModel, String> {

    public List<SymptomJourneyModel> findSymptomsByPatientId(String id);
}
