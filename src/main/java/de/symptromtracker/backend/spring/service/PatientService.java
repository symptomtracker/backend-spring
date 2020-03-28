package de.symptromtracker.backend.spring.service;

import de.symptromtracker.backend.spring.repository.PatientRepository;
import de.symptromtracker.backend.spring.security.AuthoritiesConstants;
import de.symptromtracker.backend.spring.security.SecurityUtils;
import de.symptromtracker.backend.spring.web.api.PatientApiDelegate;
import de.symptromtracker.backend.spring.web.api.model.PatientCreateRequest;
import de.symptromtracker.backend.spring.web.api.model.PatientModel;
import de.symptromtracker.backend.spring.web.api.model.SymptomJourneyModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.NativeWebRequest;

import javax.annotation.security.RolesAllowed;
import java.util.List;
import java.util.Optional;

@Service
public class PatientService implements PatientApiDelegate {
    @Autowired
    private PatientRepository patientRepository;

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
    @RolesAllowed({AuthoritiesConstants.USER, AuthoritiesConstants.ADMIN, AuthoritiesConstants.HEALTH_DEPARTMENT})
    public ResponseEntity<PatientModel> getPatient(String id) {
        SecurityContext securityContext = SecurityContextHolder.getContext();
        PatientModel response = null;
        if (securityContext.getAuthentication().getAuthorities().contains(AuthoritiesConstants.ADMIN) ||
            securityContext.getAuthentication().getAuthorities().contains(AuthoritiesConstants.HEALTH_DEPARTMENT)) {
            response = getPatientModelById(id).get();
        } else {
            User user = (User) securityContext.getAuthentication().getPrincipal();
            response = getPatientModelOfLoggedInUser(user.getUsername()).get();
        }
        return new ResponseEntity<>(response,HttpStatus.OK);
    }

    @Override
    public ResponseEntity<PatientModel> patchPatient(String id, PatientModel patientModel) {
        return null;
    }

    @Override
    public ResponseEntity<List<PatientModel>> queryPatients(Boolean highRisk, Long inactive, Long minAge, Long maxAge) {
        return null;
    }

    @PostAuthorize
        ("returnObject.id == authentication.principal.id")
    private Optional<PatientModel> getPatientModelOfLoggedInUser(String id) {
        return patientRepository.findById(id);
    }

    private Optional<PatientModel> getPatientModelById(String id) {
        return patientRepository.findById(id);
    }

}
