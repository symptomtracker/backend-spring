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

    @OneToMany(mappedBy = "catalogueItem")
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

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "CatalogueItem{" +
            "id='" + id + '\'' +
            ", description='" + description + '\'' +
            '}';
    }
}
