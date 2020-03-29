package de.symptromtracker.backend.spring;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import org.junit.jupiter.api.Test;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

class ArchTest {


    void servicesAndRepositoriesShouldNotDependOnWebLayer() {

        JavaClasses importedClasses = new ClassFileImporter()
            .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
            .importPackages("de.symptromtracker.backend.spring");

        noClasses()
            .that()
                .resideInAnyPackage("de.symptromtracker.backend.spring.service..")
            .or()
                .resideInAnyPackage("de.symptromtracker.backend.spring.repository..")
            .should().dependOnClassesThat()
                .resideInAnyPackage("..de.symptromtracker.backend.spring.web..")
        .because("Services and repositories should not depend on web layer")
        .check(importedClasses);
    }
}
