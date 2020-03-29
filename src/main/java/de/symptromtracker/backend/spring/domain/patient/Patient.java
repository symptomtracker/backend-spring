package de.symptromtracker.backend.spring.domain.patient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import de.symptromtracker.backend.spring.domain.AbstractAuditingEntity;
import de.symptromtracker.backend.spring.domain.Authority;
import de.symptromtracker.backend.spring.domain.symptom.SymptomJournal;
import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "st_patient")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Patient implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    private String id = UUID.randomUUID().toString();

    @Column(name = "linked_code")
    private String linkedCode;

    @Column(name = "name")
    private String name;

    @Email
    @Size(min = 5, max = 254)
    @Column(length = 254, unique = true, name ="email")
    private String email;

    @Column(name = "age")
    private Long age;

    @Column(name = "gender")
    private String gender;

    @Column(name = "city")
    private String city;

    @NotNull
    @Column(nullable = false)
    private boolean infected = false;

    @Size(min = 2, max = 10)
    @Column(name = "lang_key", length = 10)
    private String langKey;

    @JsonIgnore
    @ManyToMany
    @JoinTable(
        name = "jhi_user_authority",
        joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")},
        inverseJoinColumns = {@JoinColumn(name = "authority_name", referencedColumnName = "name")})
    @BatchSize(size = 20)
    private Set<Authority> authorities = new HashSet<>();

    @OneToMany(mappedBy = "patientId", cascade=CascadeType.MERGE)
    private List<RelatedAttribute> relatedAttributes = null;

    @OneToMany(mappedBy = "patientId", cascade=CascadeType.MERGE)
    private List<SymptomJournal> symptomJourney = null;

}
