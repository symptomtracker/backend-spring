package de.symptromtracker.backend.spring.domain.symptom;

import com.fasterxml.jackson.annotation.JsonProperty;
import de.symptromtracker.backend.spring.domain.catalogue.CatalogueItem;
import de.symptromtracker.backend.spring.domain.catalogue.CatalogueItemCategory;
import de.symptromtracker.backend.spring.domain.catalogue.CatalogueItemSeverity;
import de.symptromtracker.backend.spring.domain.patient.Patient;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.UUID;

@Entity
@Table(name = "st_symptom_journal")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class SymptomJournal {
    @Id
    private String id = UUID.randomUUID().toString();

    @ManyToOne(fetch = FetchType.LAZY, optional = true,cascade=CascadeType.MERGE)
    @JoinColumn(name = "patient_id", referencedColumnName = "id", nullable = true)
    private Patient patientId;
    @Column(name = "symptom_item")
    private String symptomItem;
    @Column (name = "symptom_severity")
    private String symptomSeverity;
    @Column(name = "comment")
    private String comment;
    @Column(name = "created_at")
    private Instant createdAt = Instant.now();

    public SymptomJournal() {
    }

    public SymptomJournal(Patient patientId, String symptomItem, String symptomSeverity, String comment, Instant createdAt) {
        this.patientId = patientId;
        this.symptomItem = symptomItem;
        this.symptomSeverity = symptomSeverity;
        this.comment = comment;
        this.createdAt = createdAt;
    }

    public String getId() {
        return id;
    }

    public Patient getPatientId() {
        return patientId;
    }

    public void setPatientId(Patient patientId) {
        this.patientId = patientId;
    }

    public String getSymptomItem() {
        return symptomItem;
    }

    public void setSymptomItem(String symptomItem) {
        this.symptomItem = symptomItem;
    }

    public String getSymptomSeverity() {
        return symptomSeverity;
    }

    public void setSymptomSeverity(String symptomSeverity) {
        this.symptomSeverity = symptomSeverity;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }
}
