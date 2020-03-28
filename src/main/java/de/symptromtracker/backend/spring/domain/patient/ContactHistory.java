package de.symptromtracker.backend.spring.domain.patient;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.OffsetDateTime;
@Entity
@Table(name = "st_contact_history")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class ContactHistory {
    private String id;
    private Patient patient;
    private OffsetDateTime contactDate;
    private String contactMethod;
    private String contactNote;
}