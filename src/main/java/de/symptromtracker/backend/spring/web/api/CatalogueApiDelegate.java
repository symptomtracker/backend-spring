package de.symptromtracker.backend.spring.web.api;

import de.symptromtracker.backend.spring.web.api.model.SymptomCatalogueItem;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.List;
import java.util.Optional;

/**
 * A delegate to be called by the {@link CatalogueApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-03-28T11:39:20.954440+01:00[Europe/Berlin]")

public interface CatalogueApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /catalogue : get catalogue questsions
     *
     * @return returns array of symptom catalogue items (status code 200)
     * @see CatalogueApi#getCatalogueItems
     */
    default ResponseEntity<List<SymptomCatalogueItem>> getCatalogueItems() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"@Category\" : \"@Category\", \"description\" : \"description\", \"toolTip\" : \"toolTip\", \"toolTipLink\" : \"toolTipLink\", \"symptomSeverity\" : [ \"symptomSeverity\", \"symptomSeverity\" ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /catalogue : Add a new catalogue questsion
     *
     * @param symptomCatalogueItem Representation of the current patient (required)
     * @return returns array of symptom catalogue items (status code 200)
     * @see CatalogueApi#putCatalogueQuestion
     */
    default ResponseEntity<List<SymptomCatalogueItem>> putCatalogueQuestion(List<SymptomCatalogueItem> symptomCatalogueItem) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"@Category\" : \"@Category\", \"description\" : \"description\", \"toolTip\" : \"toolTip\", \"toolTipLink\" : \"toolTipLink\", \"symptomSeverity\" : [ \"symptomSeverity\", \"symptomSeverity\" ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
