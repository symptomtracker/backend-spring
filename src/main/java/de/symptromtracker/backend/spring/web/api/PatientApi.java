/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.2.3).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package de.symptromtracker.backend.spring.web.api;

import de.symptromtracker.backend.spring.web.api.model.PatientCreateRequest;
import de.symptromtracker.backend.spring.web.api.model.PatientModel;
import de.symptromtracker.backend.spring.web.api.model.SymptomJourneyModel;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-03-28T11:39:20.954440+01:00[Europe/Berlin]")

@Validated
@Api(value = "patient", description = "the patient API")
public interface PatientApi {

    default PatientApiDelegate getDelegate() {
        return new PatientApiDelegate() {};
    }

    /**
     * POST /patient : Create new patient
     *
     * @param patientCreateRequest Describing the new patient (required)
     * @param invitationCode Invitation Code of the Health Department (optional)
     * @return successful operation (status code 200)
     */
    @ApiOperation(value = "Create new patient", nickname = "addNewPatient", notes = "", response = PatientModel.class, authorizations = {
        @Authorization(value = "oauth", scopes = {
            @AuthorizationScope(scope = "jhipster", description = "Jhipster specific claims"),
            @AuthorizationScope(scope = "email", description = "Email claims"),
            @AuthorizationScope(scope = "profile", description = "Profile claims")
            }),
        @Authorization(value = "openId")
    }, tags={ "patient", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "successful operation", response = PatientModel.class) })
    @RequestMapping(value = "/patient",
        produces = { "application/json" },
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<PatientModel> addNewPatient(@ApiParam(value = "Describing the new patient", required = true) @Valid @RequestBody PatientCreateRequest patientCreateRequest, @ApiParam(value = "Invitation Code of the Health Department") @Valid @RequestParam(value = "invitationCode", required = false) Integer invitationCode) {
        return getDelegate().addNewPatient(patientCreateRequest, invitationCode);
    }


    /**
     * PUT /patient/{_id}/symptom : Add a new
     *
     * @param id ID patient (required)
     * @param symptomJourneyModel Representation of the current patient (required)
     * @return Happy case - no content (status code 204)
     */
    @ApiOperation(value = "Add a new", nickname = "addNewSymptoms", notes = "", authorizations = {
        @Authorization(value = "oauth", scopes = {
            @AuthorizationScope(scope = "jhipster", description = "Jhipster specific claims"),
            @AuthorizationScope(scope = "email", description = "Email claims"),
            @AuthorizationScope(scope = "profile", description = "Profile claims")
            }),
        @Authorization(value = "openId")
    }, tags={ "symptoms", })
    @ApiResponses(value = {
        @ApiResponse(code = 204, message = "Happy case - no content") })
    @RequestMapping(value = "/patient/{_id}/symptom",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    default ResponseEntity<Void> addNewSymptoms(@ApiParam(value = "ID patient", required = true) @PathVariable("_id") String id, @ApiParam(value = "Representation of the current patient", required = true) @Valid @RequestBody List<SymptomJourneyModel> symptomJourneyModel) {
        return getDelegate().addNewSymptoms(id, symptomJourneyModel);
    }


    /**
     * GET /patient/{_id}/symptom : Get Symptoms
     *
     * @param id ID patient (required)
     * @return Invalid input (status code 200)
     */
    @ApiOperation(value = "Get Symptoms", nickname = "getAllSymptoms", notes = "", response = SymptomJourneyModel.class, responseContainer = "List", authorizations = {
        @Authorization(value = "oauth", scopes = {
            @AuthorizationScope(scope = "jhipster", description = "Jhipster specific claims"),
            @AuthorizationScope(scope = "email", description = "Email claims"),
            @AuthorizationScope(scope = "profile", description = "Profile claims")
            }),
        @Authorization(value = "openId")
    }, tags={ "symptoms", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Invalid input", response = SymptomJourneyModel.class, responseContainer = "List") })
    @RequestMapping(value = "/patient/{_id}/symptom",
        produces = { "application/json" },
        method = RequestMethod.GET)
    default ResponseEntity<List<SymptomJourneyModel>> getAllSymptoms(@ApiParam(value = "ID patient", required = true) @PathVariable("_id") String id) {
        return getDelegate().getAllSymptoms(id);
    }


    /**
     * GET /patient/{_id} : Get a corresponding patient
     *
     * @param id Id of the Patient (required)
     * @return successful operation (status code 200)
     */
    @ApiOperation(value = "Get a corresponding patient", nickname = "getPatient", notes = "", response = PatientModel.class, authorizations = {
        @Authorization(value = "oauth", scopes = {
            @AuthorizationScope(scope = "jhipster", description = "Jhipster specific claims"),
            @AuthorizationScope(scope = "email", description = "Email claims"),
            @AuthorizationScope(scope = "profile", description = "Profile claims")
            }),
        @Authorization(value = "openId")
    }, tags={ "patient", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "successful operation", response = PatientModel.class) })
    @RequestMapping(value = "/patient/{_id}",
        produces = { "application/json" },
        method = RequestMethod.GET)
    default ResponseEntity<PatientModel> getPatient(@ApiParam(value = "Id of the Patient", required = true) @PathVariable("_id") String id) {
        return getDelegate().getPatient(id);
    }


    /**
     * PATCH /patient/{_id} : Patch a current Patient
     *
     * @param id Id of the Patient (required)
     * @param patientModel Representation of the current patient (required)
     * @return successful operation (status code 200)
     */
    @ApiOperation(value = "Patch a current Patient", nickname = "patchPatient", notes = "", response = PatientModel.class, authorizations = {
        @Authorization(value = "oauth", scopes = {
            @AuthorizationScope(scope = "jhipster", description = "Jhipster specific claims"),
            @AuthorizationScope(scope = "email", description = "Email claims"),
            @AuthorizationScope(scope = "profile", description = "Profile claims")
            }),
        @Authorization(value = "openId")
    }, tags={ "patient", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "successful operation", response = PatientModel.class) })
    @RequestMapping(value = "/patient/{_id}",
        produces = { "application/json" },
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    default ResponseEntity<PatientModel> patchPatient(@ApiParam(value = "Id of the Patient", required = true) @PathVariable("_id") String id, @ApiParam(value = "Representation of the current patient", required = true) @Valid @RequestBody PatientModel patientModel) {
        return getDelegate().patchPatient(id, patientModel);
    }


    /**
     * GET /patient : Get a filtered list of patients
     *
     * @param highRisk whether the Patient is at Risk (optional)
     * @param inactive whether the Patient has been inactive for more than x hours (optional)
     * @param minAge minimum age of patients (optional)
     * @param maxAge maximum age of patients (optional)
     * @return successful operation (status code 200)
     */
    @ApiOperation(value = "Get a filtered list of patients", nickname = "queryPatients", notes = "", response = PatientModel.class, responseContainer = "List", authorizations = {
        @Authorization(value = "oauth", scopes = {
            @AuthorizationScope(scope = "jhipster", description = "Jhipster specific claims"),
            @AuthorizationScope(scope = "email", description = "Email claims"),
            @AuthorizationScope(scope = "profile", description = "Profile claims")
            }),
        @Authorization(value = "openId")
    }, tags={ "patient", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "successful operation", response = PatientModel.class, responseContainer = "List") })
    @RequestMapping(value = "/patient",
        produces = { "application/json" },
        method = RequestMethod.GET)
    default ResponseEntity<List<PatientModel>> queryPatients(@ApiParam(value = "whether the Patient is at Risk") @Valid @RequestParam(value = "highRisk", required = false) Boolean highRisk, @ApiParam(value = "whether the Patient has been inactive for more than x hours") @Valid @RequestParam(value = "inactive", required = false) Long inactive, @ApiParam(value = "minimum age of patients") @Valid @RequestParam(value = "minAge", required = false) Long minAge, @ApiParam(value = "maximum age of patients") @Valid @RequestParam(value = "maxAge", required = false) Long maxAge) {
        return getDelegate().queryPatients(highRisk, inactive, minAge, maxAge);
    }

}