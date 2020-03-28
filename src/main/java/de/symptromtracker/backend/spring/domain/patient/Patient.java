//package de.symptromtracker.backend.spring.domain.patient;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import com.fasterxml.jackson.annotation.JsonProperty;
//import de.symptromtracker.backend.spring.domain.AbstractAuditingEntity;
//import de.symptromtracker.backend.spring.domain.Authority;
//import de.symptromtracker.backend.spring.domain.symptom.SymptomJournal;
//import org.hibernate.annotations.BatchSize;
//import org.hibernate.annotations.Cache;
//import org.hibernate.annotations.CacheConcurrencyStrategy;
//
//import javax.persistence.*;
//import javax.validation.Valid;
//import javax.validation.constraints.Email;
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;
//import java.io.Serializable;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//@Entity
//@Table(name = "st_patient")
//@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
//public class Patient  extends AbstractAuditingEntity implements Serializable {
//    private static final long serialVersionUID = 1L;
//
//    @Id
//    private String id;
//
//    private String linkedCode;
//
//    private String name;
//
//    @Email
//    @Size(min = 5, max = 254)
//    @Column(length = 254, unique = true)
//    private String email;
//
//    private Long age;
//
//    private String gender;
//
//    private String city;
//
//    @NotNull
//    @Column(nullable = false)
//    private boolean infected = false;
//
//    @Size(min = 2, max = 10)
//    @Column(name = "lang_key", length = 10)
//    private String langKey;
//
//    @JsonIgnore
//    @ManyToMany
//    @JoinTable(
//        name = "jhi_user_authority",
//        joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")},
//        inverseJoinColumns = {@JoinColumn(name = "authority_name", referencedColumnName = "name")})
//    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
//    @BatchSize(size = 20)
//    private Set<Authority> authorities = new HashSet<>();
//
//    //@Valid
//    //@OneToMany
//    //private List<RelatedAttribute> relatedAttributes = null;
//
//    //@Valid
//    //private List<SymptomJournal> symptomJourney = null;
//
//    //@Valid
//   // private List<ContactHistory> contactHistory = null;
//
//}
