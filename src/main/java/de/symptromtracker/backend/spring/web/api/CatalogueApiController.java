package de.symptromtracker.backend.spring.web.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-03-28T11:39:20.954440+01:00[Europe/Berlin]")

@Controller
@RequestMapping("${openapi.symptromtrackerbackendspring.base-path:/api}")
public class CatalogueApiController implements CatalogueApi {

    private final CatalogueApiDelegate delegate;

    public CatalogueApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) CatalogueApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new CatalogueApiDelegate() {});
    }

    @Override
    public CatalogueApiDelegate getDelegate() {
        return delegate;
    }

}
