package de.symptromtracker.backend.spring.web.rest;

import de.symptromtracker.backend.spring.service.CatalogueService;
import de.symptromtracker.backend.spring.web.api.CatalogueApiDelegate;
import de.symptromtracker.backend.spring.web.api.model.SymptomCatalogueItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.List;
import java.util.Optional;

@Service
public class CatalogueResource implements CatalogueApiDelegate {

    @Autowired
    CatalogueService catalogueService;

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @Override
    public ResponseEntity<List<SymptomCatalogueItem>> getCatalogueItems() {
        return new ResponseEntity<>(catalogueService.getAllCatalogueItems(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<SymptomCatalogueItem>> putCatalogueQuestion(List<SymptomCatalogueItem> symptomCatalogueItem) {
        return null;
    }
}
