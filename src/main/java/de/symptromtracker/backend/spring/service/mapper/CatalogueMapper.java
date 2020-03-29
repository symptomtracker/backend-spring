package de.symptromtracker.backend.spring.service.mapper;

import de.symptromtracker.backend.spring.domain.catalogue.CatalogueItem;
import de.symptromtracker.backend.spring.domain.catalogue.CatalogueItemSeverity;
import de.symptromtracker.backend.spring.web.api.model.SymptomCatalogueItem;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CatalogueMapper {

    public SymptomCatalogueItem getSymptomCatalogueItemFromCatalogueItem(CatalogueItem catalogueItem) {
        SymptomCatalogueItem symptomCatalogueItem = new SymptomCatalogueItem();
        //Basic Fields
        symptomCatalogueItem.setAtCategory(catalogueItem.getCatalogueItemCategory().getCatalogueItemCategory());
        symptomCatalogueItem.setDescription(catalogueItem.getDescription());
        symptomCatalogueItem.setToolTip(catalogueItem.getToolTip());
        symptomCatalogueItem.setToolTipLink(catalogueItem.getToolTipLink());

        List<CatalogueItemSeverity> severityList = catalogueItem.getSymptomSeverity();
        List<String> symptomSeverity = new ArrayList<>();
        for (CatalogueItemSeverity severityItem : severityList) {
            symptomSeverity.add(severityItem.getSeverityDescription());
        }

        symptomCatalogueItem.setSymptomSeverity(symptomSeverity);

        return symptomCatalogueItem;
    }

}
