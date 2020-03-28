package de.symptromtracker.backend.spring.repository;

import de.symptromtracker.backend.spring.web.api.model.PatientModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatalgoueRepository extends JpaRepository<PatientModel, String> {
}
