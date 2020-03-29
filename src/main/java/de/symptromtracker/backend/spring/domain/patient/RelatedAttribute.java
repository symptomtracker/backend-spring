package de.symptromtracker.backend.spring.domain.patient;

import de.symptromtracker.backend.spring.config.audit.AuditEventConverter;
import de.symptromtracker.backend.spring.domain.catalogue.CatalogueItem;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "st_related_attribute")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class RelatedAttribute extends AuditEventConverter implements Serializable {

    @Id
    private String id = UUID.randomUUID().toString();

    @NotNull
    @Size(max = 50)
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private RelatedAttributeCategory relatedAttributeCategory;

    @ManyToOne(fetch = FetchType.LAZY, optional = true,cascade=CascadeType.MERGE)
    @JoinColumn(name = "patient_id", referencedColumnName = "id", nullable = true)
    private Patient patientId;

    @Column(name = "value")
    private String relatedAttributeValue = "";

    public RelatedAttribute() {
    }

    public RelatedAttribute(@NotNull @Size(max = 50) RelatedAttributeCategory relatedAttributeCategory, Patient patientId, String relatedAttributeValue) {
        this.relatedAttributeCategory = relatedAttributeCategory;
        this.patientId = patientId;
        this.relatedAttributeValue = relatedAttributeValue;
    }

    public String getId() {
        return id;
    }

    public RelatedAttributeCategory getRelatedAttributeCategory() {
        return relatedAttributeCategory;
    }

    public void setRelatedAttributeCategory(RelatedAttributeCategory relatedAttributeCategory) {
        this.relatedAttributeCategory = relatedAttributeCategory;
    }

    public Patient getPatientId() {
        return patientId;
    }

    public void setPatientId(Patient patientId) {
        this.patientId = patientId;
    }

    public String getRelatedAttributeValue() {
        return relatedAttributeValue;
    }

    public void setRelatedAttributeValue(String relatedAttributeValue) {
        this.relatedAttributeValue = relatedAttributeValue;
    }
}
