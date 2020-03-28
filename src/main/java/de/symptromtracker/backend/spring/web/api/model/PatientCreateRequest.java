package de.symptromtracker.backend.spring.web.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * PatientCreateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-03-28T11:39:20.954440+01:00[Europe/Berlin]")

public class PatientCreateRequest   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("age")
  private Long age;

  @JsonProperty("gender")
  private String gender;

  @JsonProperty("city")
  private String city;

  public PatientCreateRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PatientCreateRequest age(Long age) {
    this.age = age;
    return this;
  }

  /**
   * Get age
   * @return age
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Long getAge() {
    return age;
  }

  public void setAge(Long age) {
    this.age = age;
  }

  public PatientCreateRequest gender(String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Get gender
   * @return gender
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public PatientCreateRequest city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatientCreateRequest patientCreateRequest = (PatientCreateRequest) o;
    return Objects.equals(this.name, patientCreateRequest.name) &&
        Objects.equals(this.age, patientCreateRequest.age) &&
        Objects.equals(this.gender, patientCreateRequest.gender) &&
        Objects.equals(this.city, patientCreateRequest.city);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age, gender, city);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatientCreateRequest {\n");

    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
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

