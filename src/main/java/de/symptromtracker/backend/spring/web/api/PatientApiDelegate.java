package de.symptromtracker.backend.spring.web.api;

import de.symptromtracker.backend.spring.web.api.model.PatientCreateRequest;
import de.symptromtracker.backend.spring.web.api.model.PatientModel;
import de.symptromtracker.backend.spring.web.api.model.SymptomJourneyModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.List;
import java.util.Optional;

/**
 * A delegate to be called by the {@link PatientApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-03-28T11:39:20.954440+01:00[Europe/Berlin]")

public interface PatientApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /patient : Create new patient
     *
     * @param patientCreateRequest Describing the new patient (required)
     * @param invitationCode Invitation Code of the Health Department (optional)
     * @return successful operation (status code 200)
     * @see PatientApi#addNewPatient
     */
    default ResponseEntity<PatientModel> addNewPatient(PatientCreateRequest patientCreateRequest,
                                                       Integer invitationCode) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"linkedCode\" : \"linkedCode\", \"gender\" : \"gender\", \"relatedAttributes\" : [ { \"@Type\" : \"@Type\", \"@Value\" : \"@Value\" }, { \"@Type\" : \"@Type\", \"@Value\" : \"@Value\" } ], \"city\" : \"city\", \"symptomJourney\" : [ { \"description\" : \"description\", \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\", \"@Category\" : \"@Category\", \"comment\" : \"comment\", \"symptomSeverity\" : \"symptomSeverity\" }, { \"description\" : \"description\", \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\", \"@Category\" : \"@Category\", \"comment\" : \"comment\", \"symptomSeverity\" : \"symptomSeverity\" } ], \"name\" : \"name\", \"id\" : 0, \"age\" : 6 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /patient/{_id}/symptom : Add a new
     *
     * @param id ID patient (required)
     * @param symptomJourneyModel Representation of the current patient (required)
     * @return Happy case - no content (status code 204)
     * @see PatientApi#addNewSymptoms
     */
    default ResponseEntity<Void> addNewSymptoms(String id,
                                                List<SymptomJourneyModel> symptomJourneyModel) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /patient/{_id}/symptom : Get Symptoms
     *
     * @param id ID patient (required)
     * @return Invalid input (status code 200)
     * @see PatientApi#getAllSymptoms
     */
    default ResponseEntity<List<SymptomJourneyModel>> getAllSymptoms(String id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"description\" : \"description\", \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\", \"@Category\" : \"@Category\", \"comment\" : \"comment\", \"symptomSeverity\" : \"symptomSeverity\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /patient/{_id} : Get a corresponding patient
     *
     * @param id Id of the Patient (required)
     * @return successful operation (status code 200)
     * @see PatientApi#getPatient
     */
    default ResponseEntity<PatientModel> getPatient(String id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"linkedCode\" : \"linkedCode\", \"gender\" : \"gender\", \"relatedAttributes\" : [ { \"@Type\" : \"@Type\", \"@Value\" : \"@Value\" }, { \"@Type\" : \"@Type\", \"@Value\" : \"@Value\" } ], \"city\" : \"city\", \"symptomJourney\" : [ { \"description\" : \"description\", \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\", \"@Category\" : \"@Category\", \"comment\" : \"comment\", \"symptomSeverity\" : \"symptomSeverity\" }, { \"description\" : \"description\", \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\", \"@Category\" : \"@Category\", \"comment\" : \"comment\", \"symptomSeverity\" : \"symptomSeverity\" } ], \"name\" : \"name\", \"id\" : 0, \"age\" : 6 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PATCH /patient/{_id} : Patch a current Patient
     *
     * @param id Id of the Patient (required)
     * @param patientModel Representation of the current patient (required)
     * @return successful operation (status code 200)
     * @see PatientApi#patchPatient
     */
    default ResponseEntity<PatientModel> patchPatient(String id,
                                                      PatientModel patientModel) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"linkedCode\" : \"linkedCode\", \"gender\" : \"gender\", \"relatedAttributes\" : [ { \"@Type\" : \"@Type\", \"@Value\" : \"@Value\" }, { \"@Type\" : \"@Type\", \"@Value\" : \"@Value\" } ], \"city\" : \"city\", \"symptomJourney\" : [ { \"description\" : \"description\", \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\", \"@Category\" : \"@Category\", \"comment\" : \"comment\", \"symptomSeverity\" : \"symptomSeverity\" }, { \"description\" : \"description\", \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\", \"@Category\" : \"@Category\", \"comment\" : \"comment\", \"symptomSeverity\" : \"symptomSeverity\" } ], \"name\" : \"name\", \"id\" : 0, \"age\" : 6 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /patient : Get a filtered list of patients
     *
     * @param highRisk whether the Patient is at Risk (optional)
     * @param inactive whether the Patient has been inactive for more than x hours (optional)
     * @param minAge minimum age of patients (optional)
     * @param maxAge maximum age of patients (optional)
     * @return successful operation (status code 200)
     * @see PatientApi#queryPatients
     */
    default ResponseEntity<List<PatientModel>> queryPatients(Boolean highRisk,
                                                             Long inactive,
                                                             Long minAge,
                                                             Long maxAge) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"linkedCode\" : \"linkedCode\", \"gender\" : \"gender\", \"relatedAttributes\" : [ { \"@Type\" : \"@Type\", \"@Value\" : \"@Value\" }, { \"@Type\" : \"@Type\", \"@Value\" : \"@Value\" } ], \"city\" : \"city\", \"symptomJourney\" : [ { \"description\" : \"description\", \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\", \"@Category\" : \"@Category\", \"comment\" : \"comment\", \"symptomSeverity\" : \"symptomSeverity\" }, { \"description\" : \"description\", \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\", \"@Category\" : \"@Category\", \"comment\" : \"comment\", \"symptomSeverity\" : \"symptomSeverity\" } ], \"name\" : \"name\", \"id\" : 0, \"age\" : 6 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
