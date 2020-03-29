package de.symptromtracker.backend.spring.domain.catalogue;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Entity
@Table(name = "st_catalogue")
public class CatalogueItem {
    @Id
    @Column(name = "id")
    private String id = UUID.randomUUID().toString();

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private CatalogueItemCategory catalogueItemCategory;

    @Column(name = "description")
    private String description;

    @Column(name = "tool_tip")
    private String toolTip;

    @Column(name = "tool_tip_link")
    private String toolTipLink;

    @OneToMany(mappedBy = "catalogueItem", cascade=CascadeType.MERGE)
    private List<CatalogueItemSeverity> symptomSeverity;


    public CatalogueItem() {
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CatalogueItemCategory getCatalogueItemCategory() {
        return catalogueItemCategory;
    }

    public void setCatalogueItemCategory(CatalogueItemCategory catalogueItemCategory) {
        this.catalogueItemCategory = catalogueItemCategory;
    }

    public String getToolTip() {
        return toolTip;
    }

    public void setToolTip(String toolTip) {
        this.toolTip = toolTip;
    }

    public String getToolTipLink() {
        return toolTipLink;
    }

    public void setToolTipLink(String toolTipLink) {
        this.toolTipLink = toolTipLink;
    }

    public List<CatalogueItemSeverity> getSymptomSeverity() {
        return symptomSeverity;
    }

    public void setSymptomSeverity(List<CatalogueItemSeverity> symptomSeverity) {
        this.symptomSeverity = symptomSeverity;
    }

    @Override
    public String toString() {
        return "CatalogueItem{" +
            "id='" + id + '\'' +
            ", description='" + description + '\'' +
            '}';
    }
}
