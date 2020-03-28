/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.2.3).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package de.symptromtracker.backend.spring.web.api;

import de.symptromtracker.backend.spring.web.api.model.SymptomCatalogueItem;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-03-28T11:39:20.954440+01:00[Europe/Berlin]")

@Validated
@Api(value = "catalogue", description = "the catalogue API")
public interface CatalogueApi {

    default CatalogueApiDelegate getDelegate() {
        return new CatalogueApiDelegate() {};
    }

    /**
     * GET /catalogue : get catalogue questsions
     *
     * @return returns array of symptom catalogue items (status code 200)
     */
    @ApiOperation(value = "get catalogue questsions", nickname = "getCatalogueItems", notes = "", response = SymptomCatalogueItem.class, responseContainer = "List", authorizations = {
        @Authorization(value = "oauth", scopes = {
            @AuthorizationScope(scope = "jhipster", description = "Jhipster specific claims"),
            @AuthorizationScope(scope = "email", description = "Email claims"),
            @AuthorizationScope(scope = "profile", description = "Profile claims")
            }),
        @Authorization(value = "openId")
    }, tags={ "questionaire", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "returns array of symptom catalogue items", response = SymptomCatalogueItem.class, responseContainer = "List") })
    @RequestMapping(value = "/catalogue",
        produces = { "application/json" },
        method = RequestMethod.GET)
    default ResponseEntity<List<SymptomCatalogueItem>> getCatalogueItems() {
        return getDelegate().getCatalogueItems();
    }


    /**
     * PUT /catalogue : Add a new catalogue questsion
     *
     * @param symptomCatalogueItem Representation of the current patient (required)
     * @return returns array of symptom catalogue items (status code 200)
     */
    @ApiOperation(value = "Add a new catalogue questsion", nickname = "putCatalogueQuestion", notes = "", response = SymptomCatalogueItem.class, responseContainer = "List", authorizations = {
        @Authorization(value = "oauth", scopes = {
            @AuthorizationScope(scope = "jhipster", description = "Jhipster specific claims"),
            @AuthorizationScope(scope = "email", description = "Email claims"),
            @AuthorizationScope(scope = "profile", description = "Profile claims")
            }),
        @Authorization(value = "openId")
    }, tags={ "questionaire", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "returns array of symptom catalogue items", response = SymptomCatalogueItem.class, responseContainer = "List") })
    @RequestMapping(value = "/catalogue",
        produces = { "application/json" },
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    default ResponseEntity<List<SymptomCatalogueItem>> putCatalogueQuestion(@ApiParam(value = "Representation of the current patient", required = true) @Valid @RequestBody List<SymptomCatalogueItem> symptomCatalogueItem) {
        return getDelegate().putCatalogueQuestion(symptomCatalogueItem);
    }

}