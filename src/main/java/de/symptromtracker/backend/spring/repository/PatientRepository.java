package de.symptromtracker.backend.spring.repository;

import de.symptromtracker.backend.spring.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<User, String> {
}
