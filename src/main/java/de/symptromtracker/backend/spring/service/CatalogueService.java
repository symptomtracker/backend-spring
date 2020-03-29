package de.symptromtracker.backend.spring.service;

import de.symptromtracker.backend.spring.domain.catalogue.CatalogueItem;
import de.symptromtracker.backend.spring.repository.CatalogueRepository;
import de.symptromtracker.backend.spring.service.mapper.CatalogueMapper;
import de.symptromtracker.backend.spring.web.api.model.SymptomCatalogueItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CatalogueService {

    @Autowired
    private CatalogueRepository catalogueRepository;

    @Autowired
    private CatalogueMapper catalogueMapper;

    public List<SymptomCatalogueItem> getAllCatalogueItems()
    {
        List<CatalogueItem> catalogueItemList = catalogueRepository.findAll();
        return catalogueItemList.stream().map(catalogueMapper::getSymptomCatalogueItemFromCatalogueItem).collect(Collectors.toList());
    }
}
