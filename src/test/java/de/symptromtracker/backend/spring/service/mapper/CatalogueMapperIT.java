package de.symptromtracker.backend.spring.service.mapper;

import de.symptromtracker.backend.spring.SymptomtrackerbackendspringApp;
import de.symptromtracker.backend.spring.config.TestSecurityConfiguration;
import de.symptromtracker.backend.spring.domain.catalogue.CatalogueItem;
import de.symptromtracker.backend.spring.domain.catalogue.CatalogueItemCategory;
import de.symptromtracker.backend.spring.domain.catalogue.CatalogueItemSeverity;
import de.symptromtracker.backend.spring.web.api.model.SymptomCatalogueItem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = {SymptomtrackerbackendspringApp.class, TestSecurityConfiguration.class})
@Transactional
public class CatalogueMapperIT {

    @Autowired
    private CatalogueMapper catalogueMapper;

    private CatalogueItem catalogueItem;
    private CatalogueItemCategory catalogueItemCategory;
    List<CatalogueItemSeverity> severityList;

    @BeforeEach
    public void init() {
        initCatalogueItem();
        initCatalogueItemCategory();
        initSeverityList();
    }

    private void initCatalogueItem() {
        catalogueItem = new CatalogueItem();
        catalogueItem.setDescription("Haben Sie Husten?");
        catalogueItem.setToolTip("Husten ist nicht gut");
        catalogueItem.setToolTipLink("www.symptomtracker.de");
    }

    private void initCatalogueItemCategory() {
        catalogueItemCategory = new CatalogueItemCategory();
        catalogueItemCategory.setCatalogueItemCategory("LUNGE");
        catalogueItem.setCatalogueItemCategory(catalogueItemCategory);
    }

    private void initSeverityList() {
        severityList = new ArrayList<>();
        severityList.add(new CatalogueItemSeverity(catalogueItem, 0, "Keine Symptome"));
        severityList.add(new CatalogueItemSeverity(catalogueItem, 1, "Leichte Symptome"));
        severityList.add(new CatalogueItemSeverity(catalogueItem, 2, "Mittel Symptome"));
        severityList.add(new CatalogueItemSeverity(catalogueItem, 3, "Schwere Symptome"));
        catalogueItem.setSymptomSeverity(severityList);
    }

    @Test
    public void checkMapping() {
        SymptomCatalogueItem symptomCatalogueItem = catalogueMapper.getSymptomCatalogueItemFromCatalogueItem(catalogueItem);
        assertThat(symptomCatalogueItem.getDescription()).isEqualTo(catalogueItem.getDescription());
        assertThat(symptomCatalogueItem.getSymptomSeverity().size()).isEqualTo(4);
    }
}
