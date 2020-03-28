package de.symptromtracker.backend.spring.domain.catalogue;

import de.symptromtracker.backend.spring.config.audit.AuditEventConverter;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "st_catalogue_item_category")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class CatalogueItemCategory extends AuditEventConverter implements Serializable {
    @NotNull
    @Size(max = 50)
    @Id
    @Column(length = 50)
    private String catalogueItemCategory;
}
