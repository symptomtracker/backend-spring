package de.symptromtracker.backend.spring.web.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * RelatedAttribute
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-03-28T11:39:20.954440+01:00[Europe/Berlin]")

public class RelatedAttribute   {
  @JsonProperty("@Type")
  private String atType;

  @JsonProperty("@Value")
  private String atValue;

  public RelatedAttribute atType(String atType) {
    this.atType = atType;
    return this;
  }

  /**
   * Get atType
   * @return atType
  */
  @ApiModelProperty(value = "")


  public String getAtType() {
    return atType;
  }

  public void setAtType(String atType) {
    this.atType = atType;
  }

  public RelatedAttribute atValue(String atValue) {
    this.atValue = atValue;
    return this;
  }

  /**
   * Get atValue
   * @return atValue
  */
  @ApiModelProperty(value = "")


  public String getAtValue() {
    return atValue;
  }

  public void setAtValue(String atValue) {
    this.atValue = atValue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelatedAttribute relatedAttribute = (RelatedAttribute) o;
    return Objects.equals(this.atType, relatedAttribute.atType) &&
        Objects.equals(this.atValue, relatedAttribute.atValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedAttribute {\n");

    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atValue: ").append(toIndentedString(atValue)).append("\n");
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

