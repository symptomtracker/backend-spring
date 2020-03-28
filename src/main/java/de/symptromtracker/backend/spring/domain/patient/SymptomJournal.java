package de.symptromtracker.backend.spring.domain.patient;

import com.fasterxml.jackson.annotation.JsonProperty;
import de.symptromtracker.backend.spring.domain.catalogue.CatalogueItem;
import de.symptromtracker.backend.spring.domain.catalogue.CatalogueItemCategory;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.OffsetDateTime;

@Entity
@Table(name = "st_symptom_journal")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class SymptomJournal {
    @Id
    private String id;
    private CatalogueItem catalogueItem;
    private String symptomSeverity;
    private String comment;
    private OffsetDateTime createdAt;
}
