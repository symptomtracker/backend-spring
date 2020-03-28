package de.symptromtracker.backend.spring.web.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * SymptomCatalogueItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-03-28T11:39:20.954440+01:00[Europe/Berlin]")

public class SymptomCatalogueItem   {
  @JsonProperty("@Category")
  private String atCategory;

  @JsonProperty("description")
  private String description;

  @JsonProperty("toolTip")
  private String toolTip;

  @JsonProperty("toolTipLink")
  private String toolTipLink;

  @JsonProperty("symptomSeverity")
  @Valid
  private List<String> symptomSeverity = new ArrayList<>();

  public SymptomCatalogueItem atCategory(String atCategory) {
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

  public SymptomCatalogueItem description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SymptomCatalogueItem toolTip(String toolTip) {
    this.toolTip = toolTip;
    return this;
  }

  /**
   * Get toolTip
   * @return toolTip
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getToolTip() {
    return toolTip;
  }

  public void setToolTip(String toolTip) {
    this.toolTip = toolTip;
  }

  public SymptomCatalogueItem toolTipLink(String toolTipLink) {
    this.toolTipLink = toolTipLink;
    return this;
  }

  /**
   * Get toolTipLink
   * @return toolTipLink
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getToolTipLink() {
    return toolTipLink;
  }

  public void setToolTipLink(String toolTipLink) {
    this.toolTipLink = toolTipLink;
  }

  public SymptomCatalogueItem symptomSeverity(List<String> symptomSeverity) {
    this.symptomSeverity = symptomSeverity;
    return this;
  }

  public SymptomCatalogueItem addSymptomSeverityItem(String symptomSeverityItem) {
    this.symptomSeverity.add(symptomSeverityItem);
    return this;
  }

  /**
   * Get symptomSeverity
   * @return symptomSeverity
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public List<String> getSymptomSeverity() {
    return symptomSeverity;
  }

  public void setSymptomSeverity(List<String> symptomSeverity) {
    this.symptomSeverity = symptomSeverity;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SymptomCatalogueItem symptomCatalogueItem = (SymptomCatalogueItem) o;
    return Objects.equals(this.atCategory, symptomCatalogueItem.atCategory) &&
        Objects.equals(this.description, symptomCatalogueItem.description) &&
        Objects.equals(this.toolTip, symptomCatalogueItem.toolTip) &&
        Objects.equals(this.toolTipLink, symptomCatalogueItem.toolTipLink) &&
        Objects.equals(this.symptomSeverity, symptomCatalogueItem.symptomSeverity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atCategory, description, toolTip, toolTipLink, symptomSeverity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SymptomCatalogueItem {\n");

    sb.append("    atCategory: ").append(toIndentedString(atCategory)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    toolTip: ").append(toIndentedString(toolTip)).append("\n");
    sb.append("    toolTipLink: ").append(toIndentedString(toolTipLink)).append("\n");
    sb.append("    symptomSeverity: ").append(toIndentedString(symptomSeverity)).append("\n");
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

