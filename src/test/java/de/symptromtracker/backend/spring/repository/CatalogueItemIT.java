package de.symptromtracker.backend.spring.repository;

import de.symptromtracker.backend.spring.SymptomtrackerbackendspringApp;
import de.symptromtracker.backend.spring.config.TestSecurityConfiguration;
import de.symptromtracker.backend.spring.domain.catalogue.CatalogueItem;
import de.symptromtracker.backend.spring.domain.catalogue.CatalogueItemCategory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.time.Clock;
import java.util.List;
import java.util.Optional;

@SpringBootTest(classes = {SymptomtrackerbackendspringApp.class, TestSecurityConfiguration.class})
@Transactional
public class CatalogueItemIT {

    @Autowired
    private CatalgoueRepository catalgoueRepository;


    @Test
    public void checkDataBase() {
        Optional<CatalogueItem> catalogueItem = catalgoueRepository.findById("1");
        List<CatalogueItem> catalogueItemList = catalgoueRepository.findAll();
    }

    @Test
    public void writeToDatabase()
    {
        CatalogueItem catalogueItem = new CatalogueItem();
        catalogueItem.setDescription("HELLO MY NAME IS DR. DRE");
        CatalogueItemCategory catalogueItemCategory = new CatalogueItemCategory();
        catalogueItemCategory.setCatalogueItemCategory("HERZ");
        catalogueItem.setCatalogueItemCategory(catalogueItemCategory);
        catalgoueRepository.save(catalogueItem);
        List<CatalogueItem> catalogueItemList = catalgoueRepository.findAll();
        System.out.println("HELLO");
    }

}
