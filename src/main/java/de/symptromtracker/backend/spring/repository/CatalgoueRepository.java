package de.symptromtracker.backend.spring.repository;

import de.symptromtracker.backend.spring.domain.catalogue.CatalogueItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatalgoueRepository  extends JpaRepository<CatalogueItem, String> {


}
