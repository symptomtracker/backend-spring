package de.symptromtracker.backend.spring.web.rest;

import de.symptromtracker.backend.spring.service.UserService;
import de.symptromtracker.backend.spring.web.api.PatientApiDelegate;
import de.symptromtracker.backend.spring.web.api.model.PatientCreateRequest;
import de.symptromtracker.backend.spring.web.api.model.PatientModel;
import de.symptromtracker.backend.spring.web.api.model.SymptomJourneyModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.List;
import java.util.Optional;

@Service
public class PatientResource implements PatientApiDelegate {

    @Autowired
    private UserService userService;

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @Override
    public ResponseEntity<PatientModel> addNewPatient(PatientCreateRequest patientCreateRequest, Integer invitationCode) {
        return null;
    }

    @Override
    public ResponseEntity<Void> addNewSymptoms(String id, List<SymptomJourneyModel> symptomJourneyModel) {
        return null;
    }

    @Override
    public ResponseEntity<List<SymptomJourneyModel>> getAllSymptoms(String id) {
        return null;
    }

    @Override
    public ResponseEntity<PatientModel> getPatient(String id) {
        return null;
    }

    @Override
    public ResponseEntity<PatientModel> patchPatient(String id, PatientModel patientModel) {
        return null;
    }

    @Override
    public ResponseEntity<List<PatientModel>> queryPatients(Boolean highRisk, Long inactive, Long minAge, Long maxAge) {
        return null;
    }


}
