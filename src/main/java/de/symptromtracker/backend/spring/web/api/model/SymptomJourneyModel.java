package de.symptromtracker.backend.spring.web.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * SymptomJourneyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-03-28T11:39:20.954440+01:00[Europe/Berlin]")

public class SymptomJourneyModel   {
  @JsonProperty("@Category")
  private String atCategory;

  @JsonProperty("description")
  private String description;

  @JsonProperty("symptomSeverity")
  private String symptomSeverity;

  @JsonProperty("comment")
  private String comment;

  @JsonProperty("createdAt")
  private OffsetDateTime createdAt;

  public SymptomJourneyModel atCategory(String atCategory) {
    this.atCategory = atCategory;
    return this;
  }

  /**
   * Get atCategory
   * @return atCategory
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getAtCategory() {
    return atCategory;
  }

  public void setAtCategory(String atCategory) {
    this.atCategory = atCategory;
  }

  public SymptomJourneyModel description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SymptomJourneyModel symptomSeverity(String symptomSeverity) {
    this.symptomSeverity = symptomSeverity;
    return this;
  }

  /**
   * Get symptomSeverity
   * @return symptomSeverity
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getSymptomSeverity() {
    return symptomSeverity;
  }

  public void setSymptomSeverity(String symptomSeverity) {
    this.symptomSeverity = symptomSeverity;
  }

  public SymptomJourneyModel comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Get comment
   * @return comment
  */
  @ApiModelProperty(value = "")


  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public SymptomJourneyModel createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SymptomJourneyModel symptomJourneyModel = (SymptomJourneyModel) o;
    return Objects.equals(this.atCategory, symptomJourneyModel.atCategory) &&
        Objects.equals(this.description, symptomJourneyModel.description) &&
        Objects.equals(this.symptomSeverity, symptomJourneyModel.symptomSeverity) &&
        Objects.equals(this.comment, symptomJourneyModel.comment) &&
        Objects.equals(this.createdAt, symptomJourneyModel.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atCategory, description, symptomSeverity, comment, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SymptomJourneyModel {\n");

    sb.append("    atCategory: ").append(toIndentedString(atCategory)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    symptomSeverity: ").append(toIndentedString(symptomSeverity)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

