package de.symptromtracker.backend.spring.repository;

import de.symptromtracker.backend.spring.SymptomtrackerbackendspringApp;
import de.symptromtracker.backend.spring.config.TestSecurityConfiguration;
import de.symptromtracker.backend.spring.domain.patient.Patient;
import de.symptromtracker.backend.spring.domain.patient.RelatedAttribute;
import de.symptromtracker.backend.spring.domain.patient.RelatedAttributeCategory;
import de.symptromtracker.backend.spring.domain.symptom.SymptomJournal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = {SymptomtrackerbackendspringApp.class, TestSecurityConfiguration.class})
@Transactional
public class PatientRepositoryIT {

    @Autowired
    private PatientRepository patientRepository;

    private Patient patient;
    private RelatedAttribute relatedAttribute;
    private SymptomJournal symptomJournal;

    @BeforeEach
    public void initTestData() {
        patient = new Patient();
        patient.setAge(40);
        patient.setCity("NUERNBERG");
        patient.setEmail("peter.heinz@gmail.com");
        patient.setName("Peter Heinz");
        patient.setInfected(false);
        patientRepository.save(patient);
        initRelatedAttribute();
        initSymptomJournal();
    }

    private void initSymptomJournal() {
        symptomJournal = new SymptomJournal();
        symptomJournal.setComment("Es macht sehr aua");
        symptomJournal.setPatientId(patient);
        symptomJournal.setSymptomItem("Halsschmerzen");
        symptomJournal.setSymptomSeverity("Sehr stark");
    }

    public void initRelatedAttribute() {
        relatedAttribute = new RelatedAttribute();
        relatedAttribute.setPatientId(patient);
        relatedAttribute.setRelatedAttributeValue("Ja");
        relatedAttribute.setRelatedAttributeCategory(new RelatedAttributeCategory("VORERKRANKT"));
    }

    @Test
    public void getInitialData() {
        List<Patient> patientList = patientRepository.findAll();
        assertThat(patientList.size()).isEqualTo(2);
    }

    @Test
    public void checkIfSavedDataIsPresent() {
        assertThat(patientRepository.findById(patient.getId()).isPresent());
    }

    @Test
    public void createRelatedAttribute() {
        patient.getRelatedAttributes().add(relatedAttribute);
        patientRepository.save(patient);
        assertThat(patientRepository.findById(patient.getId()).get().getRelatedAttributes().size()).isEqualTo(1);
    }

    @Test
    public void createSymptomJournal()
    {
        patient.getSymptomJourney().add(symptomJournal);
        patientRepository.save(patient);
        assertThat(patientRepository.findById(patient.getId()).get().getSymptomJourney().size()).isEqualTo(1);
    }

    @Test
    public void createSymptomJournalPlusRelatedAttribute()
    {
        patient.getSymptomJourney().add(symptomJournal);
        patient.getRelatedAttributes().add(relatedAttribute);
        patientRepository.save(patient);
        assertThat(patientRepository.findById(patient.getId()).get().getSymptomJourney().size()).isEqualTo(1);
        assertThat(patientRepository.findById(patient.getId()).get().getRelatedAttributes().size()).isEqualTo(1);
    }
}
