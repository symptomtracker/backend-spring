package de.symptromtracker.backend.spring.domain.catalogue;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "st_catalogue_item_severity")
public class CatalogueItemSeverity {
    @Id
    @Column(name = "id")
    private String id = UUID.randomUUID().toString();

    @ManyToOne(fetch = FetchType.LAZY, optional = false,cascade=CascadeType.MERGE)
    @JoinColumn(name = "catalogue_item_id", referencedColumnName = "id", nullable = false)
    private CatalogueItem catalogueItem;

    @Column(name = "severity")
    private int severityNumericValue;

    @Column(name = "severity_description")
    private String severityDescription = "";

    public CatalogueItemSeverity() {
    }

    public CatalogueItemSeverity(CatalogueItem catalogueItem, int severityNumericValue, String severityDescription) {
        this.id = id;
        this.catalogueItem = catalogueItem;
        this.severityNumericValue = severityNumericValue;
        this.severityDescription = severityDescription;
    }

    public String getId() {
        return id;
    }


    public CatalogueItem getCatalogueItem() {
        return catalogueItem;
    }

    public void setCatalogueItem(CatalogueItem catalogueItem) {
        this.catalogueItem = catalogueItem;
    }

    public int getSeverityNumericValue() {
        return severityNumericValue;
    }

    public void setSeverityNumericValue(int severityNumericValue) {
        this.severityNumericValue = severityNumericValue;
    }

    public String getSeverityDescription() {
        return severityDescription;
    }

    public void setSeverityDescription(String severityDescription) {
        this.severityDescription = severityDescription;
    }
}
