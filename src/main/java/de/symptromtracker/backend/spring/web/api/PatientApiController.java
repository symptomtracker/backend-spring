package de.symptromtracker.backend.spring.web.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-03-28T11:39:20.954440+01:00[Europe/Berlin]")

@Controller
@RequestMapping("${openapi.symptromtrackerbackendspring.base-path:/api}")
public class PatientApiController implements PatientApi {

    private final PatientApiDelegate delegate;

    public PatientApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) PatientApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new PatientApiDelegate() {});
    }

    @Override
    public PatientApiDelegate getDelegate() {
        return delegate;
    }

}
