package de.symptromtracker.backend.spring.web.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.List;
import java.util.Optional;

/**
 * A delegate to be called by the {@link MessagePatientsApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-03-28T11:39:20.954440+01:00[Europe/Berlin]")

public interface MessagePatientsApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /messagePatients : send email to list of patients specified by list of id
     *
     * @param ids list of patient ids (required)
     * @return sending has been successful (status code 204)
     * @see MessagePatientsApi#messagePatients
     */
    default ResponseEntity<Void> messagePatients(List<Integer> ids) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
