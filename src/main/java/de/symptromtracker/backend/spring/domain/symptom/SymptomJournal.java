//package de.symptromtracker.backend.spring.domain.symptom;
//
//import com.fasterxml.jackson.annotation.JsonProperty;
//import de.symptromtracker.backend.spring.domain.catalogue.CatalogueItem;
//import de.symptromtracker.backend.spring.domain.catalogue.CatalogueItemCategory;
//import de.symptromtracker.backend.spring.domain.catalogue.CatalogueItemSeverity;
//import org.hibernate.annotations.Cache;
//import org.hibernate.annotations.CacheConcurrencyStrategy;
//
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import java.time.Instant;
//import java.time.OffsetDateTime;
//
////@Entity
////@Table(name = "st_symptom_journal")
////@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
////public class SymptomJournal {
////    @Id
////    private String id;
////    private CatalogueItem catalogueItem;
////    private CatalogueItemSeverity symptomSeverity;
////    private String comment;
////    private Instant createdAt;
////}
