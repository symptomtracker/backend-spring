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
import java.util.*;

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
    @Column(length = 254, unique = true, name = "email")
    private String email;

    @Column(name = "age")
    private int age;

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

    @OneToMany(mappedBy = "patientId", cascade = CascadeType.MERGE)
    private List<RelatedAttribute> relatedAttributes = new ArrayList<>();

    @OneToMany(mappedBy = "patientId", cascade = CascadeType.MERGE)
    private List<SymptomJournal> symptomJourney = new ArrayList<>();

    public Patient() {
    }

    public Patient(String id, String linkedCode, String name, @Email @Size(min = 5, max = 254) String email, int age, String gender, String city, @NotNull boolean infected, @Size(min = 2, max = 10) String langKey, Set<Authority> authorities, List<RelatedAttribute> relatedAttributes, List<SymptomJournal> symptomJourney) {
        this.id = id;
        this.linkedCode = linkedCode;
        this.name = name;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.city = city;
        this.infected = infected;
        this.langKey = langKey;
        this.authorities = authorities;
        this.relatedAttributes = relatedAttributes;
        this.symptomJourney = symptomJourney;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLinkedCode() {
        return linkedCode;
    }

    public void setLinkedCode(String linkedCode) {
        this.linkedCode = linkedCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isInfected() {
        return infected;
    }

    public void setInfected(boolean infected) {
        this.infected = infected;
    }

    public String getLangKey() {
        return langKey;
    }

    public void setLangKey(String langKey) {
        this.langKey = langKey;
    }

    public Set<Authority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Set<Authority> authorities) {
        this.authorities = authorities;
    }

    public List<RelatedAttribute> getRelatedAttributes() {
        return relatedAttributes;
    }

    public void setRelatedAttributes(List<RelatedAttribute> relatedAttributes) {
        this.relatedAttributes = relatedAttributes;
    }

    public List<SymptomJournal> getSymptomJourney() {
        return symptomJourney;
    }

    public void setSymptomJourney(List<SymptomJournal> symptomJourney) {
        this.symptomJourney = symptomJourney;
    }
}
