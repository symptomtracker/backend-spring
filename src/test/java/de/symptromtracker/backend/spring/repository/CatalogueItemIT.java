package de.symptromtracker.backend.spring.repository;

import de.symptromtracker.backend.spring.SymptomtrackerbackendspringApp;
import de.symptromtracker.backend.spring.config.TestSecurityConfiguration;
import de.symptromtracker.backend.spring.domain.catalogue.CatalogueItem;
import de.symptromtracker.backend.spring.domain.catalogue.CatalogueItemCategory;
import de.symptromtracker.backend.spring.domain.catalogue.CatalogueItemSeverity;
import de.symptromtracker.backend.spring.security.AuthoritiesConstants;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = {SymptomtrackerbackendspringApp.class, TestSecurityConfiguration.class})
@Transactional
public class CatalogueItemIT {

    @Autowired
    private CatalogueRepository catalogueRepository;

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
    public void checkDataBase() {
        Optional<CatalogueItem> catalogueItem = catalogueRepository.findById("1");
        List<CatalogueItem> catalogueItemList = catalogueRepository.findAll();
        assertThat(catalogueItemList.size()).isEqualTo(1);
    }

    @Test
    public void writeToDatabase() {
        catalogueRepository.save(catalogueItem);
        List<CatalogueItem> catalogueItemList = catalogueRepository.findAll();
        assertThat(catalogueItemList.size()).isEqualTo(2);
    }

    @Test
    public void simpleUpdateDatabaseEntry() {
        String description_change = "LULULU";
        catalogueRepository.save(catalogueItem);
        //Getting catalogueitem out of the database
        CatalogueItem catItem = catalogueRepository.findById(catalogueItem.getId()).get();
        //modifying the database
        catItem.setDescription(description_change);
        //saving it again
        catalogueRepository.save(catItem);
        assertThat(catalogueRepository.findById(catalogueItem.getId()).get().getDescription()).isEqualTo(description_change);
    }
}
