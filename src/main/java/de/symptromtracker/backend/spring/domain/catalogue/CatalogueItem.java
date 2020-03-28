package de.symptromtracker.backend.spring.domain.catalogue;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "st_catalogue")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class CatalogueItem {
    @Id
    private String id;
    private CatalogueItemCategory catalogueItemCategory;
    private String description;
    private String toolTip;
    private String toolTipLink;
    private List<String> symptomSeverity = new ArrayList<>();
}
