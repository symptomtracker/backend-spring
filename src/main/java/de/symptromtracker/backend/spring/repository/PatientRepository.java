package de.symptromtracker.backend.spring.repository;

import de.symptromtracker.backend.spring.domain.User;
import de.symptromtracker.backend.spring.web.api.model.PatientModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<PatientModel, String> {
}
