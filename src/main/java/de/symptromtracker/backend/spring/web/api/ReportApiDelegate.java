package de.symptromtracker.backend.spring.web.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

/**
 * A delegate to be called by the {@link ReportApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-03-28T11:39:20.954440+01:00[Europe/Berlin]")

public interface ReportApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /report : generate report
     *
     * @return Response (status code 200)
     * @see ReportApi#getReport
     */
    default ResponseEntity<Void> getReport() {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
