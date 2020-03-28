package de.symptromtracker.backend.spring.domain.catalogue;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "st_catalogue")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class CatalogueItem {
    @Id
    @Column(name = "id")
    private String id;

    // @OneToOne(cascade = CascadeType.ALL)
    //@JoinColumn(name = "st_catalogue_item_category_id", referencedColumnName = "id")
    //private CatalogueItemCategory catalogueItemCategory;
    @Column(name = "description")
    private String description;
    //private String toolTip;
    //private String toolTipLink;
    //private List<CatalogueItemSeverity> symptomSeverity = new ArrayList<>();


    public CatalogueItem(String id, String description) {
        this.id = id;
        this.description = description;
    }

    public CatalogueItem() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "CatalogueItem{" +
            "id='" + id + '\'' +
            ", description='" + description + '\'' +
            '}';
    }
}
