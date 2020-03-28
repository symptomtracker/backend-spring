package de.symptromtracker.backend.spring.web.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PatientModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-03-28T11:39:20.954440+01:00[Europe/Berlin]")

public class PatientModel   {
  @JsonProperty("_id")
  private String id;

  @JsonProperty("linkedCode")
  private String linkedCode;

  @JsonProperty("name")
  private String name;

  @JsonProperty("age")
  private Long age;

  @JsonProperty("gender")
  private String gender;

  @JsonProperty("city")
  private String city;

  @JsonProperty("geo_risk")
  private Boolean geoRisk;

  @JsonProperty("contact_risk")
  private Boolean contactRisk;

  @JsonProperty("contact_date")
  private OffsetDateTime contactDate;

  @JsonProperty("work")
  private String work;

  @JsonProperty("smoker")
  private Boolean smoker;

  @JsonProperty("preexisting_conditions")
  @Valid
  private List<String> preexistingConditions = null;

  @JsonProperty("immunal_suppressors")
  private Boolean immunalSuppressors;

  @JsonProperty("pregnant")
  private Boolean pregnant;

  @JsonProperty("relatedAttributes")
  @Valid
  private List<RelatedAttribute> relatedAttributes = null;

  @JsonProperty("symptomJourney")
  @Valid
  private List<SymptomJourneyModel> symptomJourney = null;

  public PatientModel id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PatientModel linkedCode(String linkedCode) {
    this.linkedCode = linkedCode;
    return this;
  }

  /**
   * Get linkedCode
   * @return linkedCode
  */
  @ApiModelProperty(value = "")


  public String getLinkedCode() {
    return linkedCode;
  }

  public void setLinkedCode(String linkedCode) {
    this.linkedCode = linkedCode;
  }

  public PatientModel name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PatientModel age(Long age) {
    this.age = age;
    return this;
  }

  /**
   * Get age
   * @return age
  */
  @ApiModelProperty(value = "")


  public Long getAge() {
    return age;
  }

  public void setAge(Long age) {
    this.age = age;
  }

  public PatientModel gender(String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Get gender
   * @return gender
  */
  @ApiModelProperty(value = "")


  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public PatientModel city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
  */
  @ApiModelProperty(value = "")


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public PatientModel geoRisk(Boolean geoRisk) {
    this.geoRisk = geoRisk;
    return this;
  }

  /**
   * Get geoRisk
   * @return geoRisk
  */
  @ApiModelProperty(value = "")


  public Boolean getGeoRisk() {
    return geoRisk;
  }

  public void setGeoRisk(Boolean geoRisk) {
    this.geoRisk = geoRisk;
  }

  public PatientModel contactRisk(Boolean contactRisk) {
    this.contactRisk = contactRisk;
    return this;
  }

  /**
   * Get contactRisk
   * @return contactRisk
  */
  @ApiModelProperty(value = "")


  public Boolean getContactRisk() {
    return contactRisk;
  }

  public void setContactRisk(Boolean contactRisk) {
    this.contactRisk = contactRisk;
  }

  public PatientModel contactDate(OffsetDateTime contactDate) {
    this.contactDate = contactDate;
    return this;
  }

  /**
   * Get contactDate
   * @return contactDate
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getContactDate() {
    return contactDate;
  }

  public void setContactDate(OffsetDateTime contactDate) {
    this.contactDate = contactDate;
  }

  public PatientModel work(String work) {
    this.work = work;
    return this;
  }

  /**
   * Get work
   * @return work
  */
  @ApiModelProperty(value = "")


  public String getWork() {
    return work;
  }

  public void setWork(String work) {
    this.work = work;
  }

  public PatientModel smoker(Boolean smoker) {
    this.smoker = smoker;
    return this;
  }

  /**
   * Get smoker
   * @return smoker
  */
  @ApiModelProperty(value = "")


  public Boolean getSmoker() {
    return smoker;
  }

  public void setSmoker(Boolean smoker) {
    this.smoker = smoker;
  }

  public PatientModel preexistingConditions(List<String> preexistingConditions) {
    this.preexistingConditions = preexistingConditions;
    return this;
  }

  public PatientModel addPreexistingConditionsItem(String preexistingConditionsItem) {
    if (this.preexistingConditions == null) {
      this.preexistingConditions = new ArrayList<>();
    }
    this.preexistingConditions.add(preexistingConditionsItem);
    return this;
  }

  /**
   * Get preexistingConditions
   * @return preexistingConditions
  */
  @ApiModelProperty(value = "")


  public List<String> getPreexistingConditions() {
    return preexistingConditions;
  }

  public void setPreexistingConditions(List<String> preexistingConditions) {
    this.preexistingConditions = preexistingConditions;
  }

  public PatientModel immunalSuppressors(Boolean immunalSuppressors) {
    this.immunalSuppressors = immunalSuppressors;
    return this;
  }

  /**
   * Get immunalSuppressors
   * @return immunalSuppressors
  */
  @ApiModelProperty(value = "")


  public Boolean getImmunalSuppressors() {
    return immunalSuppressors;
  }

  public void setImmunalSuppressors(Boolean immunalSuppressors) {
    this.immunalSuppressors = immunalSuppressors;
  }

  public PatientModel pregnant(Boolean pregnant) {
    this.pregnant = pregnant;
    return this;
  }

  /**
   * Get pregnant
   * @return pregnant
  */
  @ApiModelProperty(value = "")


  public Boolean getPregnant() {
    return pregnant;
  }

  public void setPregnant(Boolean pregnant) {
    this.pregnant = pregnant;
  }

  public PatientModel relatedAttributes(List<RelatedAttribute> relatedAttributes) {
    this.relatedAttributes = relatedAttributes;
    return this;
  }

  public PatientModel addRelatedAttributesItem(RelatedAttribute relatedAttributesItem) {
    if (this.relatedAttributes == null) {
      this.relatedAttributes = new ArrayList<>();
    }
    this.relatedAttributes.add(relatedAttributesItem);
    return this;
  }

  /**
   * Get relatedAttributes
   * @return relatedAttributes
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<RelatedAttribute> getRelatedAttributes() {
    return relatedAttributes;
  }

  public void setRelatedAttributes(List<RelatedAttribute> relatedAttributes) {
    this.relatedAttributes = relatedAttributes;
  }

  public PatientModel symptomJourney(List<SymptomJourneyModel> symptomJourney) {
    this.symptomJourney = symptomJourney;
    return this;
  }

  public PatientModel addSymptomJourneyItem(SymptomJourneyModel symptomJourneyItem) {
    if (this.symptomJourney == null) {
      this.symptomJourney = new ArrayList<>();
    }
    this.symptomJourney.add(symptomJourneyItem);
    return this;
  }

  /**
   * Get symptomJourney
   * @return symptomJourney
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<SymptomJourneyModel> getSymptomJourney() {
    return symptomJourney;
  }

  public void setSymptomJourney(List<SymptomJourneyModel> symptomJourney) {
    this.symptomJourney = symptomJourney;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatientModel patientModel = (PatientModel) o;
    return Objects.equals(this.id, patientModel.id) &&
        Objects.equals(this.linkedCode, patientModel.linkedCode) &&
        Objects.equals(this.name, patientModel.name) &&
        Objects.equals(this.age, patientModel.age) &&
        Objects.equals(this.gender, patientModel.gender) &&
        Objects.equals(this.city, patientModel.city) &&
        Objects.equals(this.geoRisk, patientModel.geoRisk) &&
        Objects.equals(this.contactRisk, patientModel.contactRisk) &&
        Objects.equals(this.contactDate, patientModel.contactDate) &&
        Objects.equals(this.work, patientModel.work) &&
        Objects.equals(this.smoker, patientModel.smoker) &&
        Objects.equals(this.preexistingConditions, patientModel.preexistingConditions) &&
        Objects.equals(this.immunalSuppressors, patientModel.immunalSuppressors) &&
        Objects.equals(this.pregnant, patientModel.pregnant) &&
        Objects.equals(this.relatedAttributes, patientModel.relatedAttributes) &&
        Objects.equals(this.symptomJourney, patientModel.symptomJourney);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, linkedCode, name, age, gender, city, geoRisk, contactRisk, contactDate, work, smoker, preexistingConditions, immunalSuppressors, pregnant, relatedAttributes, symptomJourney);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatientModel {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedCode: ").append(toIndentedString(linkedCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    geoRisk: ").append(toIndentedString(geoRisk)).append("\n");
    sb.append("    contactRisk: ").append(toIndentedString(contactRisk)).append("\n");
    sb.append("    contactDate: ").append(toIndentedString(contactDate)).append("\n");
    sb.append("    work: ").append(toIndentedString(work)).append("\n");
    sb.append("    smoker: ").append(toIndentedString(smoker)).append("\n");
    sb.append("    preexistingConditions: ").append(toIndentedString(preexistingConditions)).append("\n");
    sb.append("    immunalSuppressors: ").append(toIndentedString(immunalSuppressors)).append("\n");
    sb.append("    pregnant: ").append(toIndentedString(pregnant)).append("\n");
    sb.append("    relatedAttributes: ").append(toIndentedString(relatedAttributes)).append("\n");
    sb.append("    symptomJourney: ").append(toIndentedString(symptomJourney)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

