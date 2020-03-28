//package de.symptromtracker.backend.spring.domain.patient;
//
//import org.hibernate.annotations.Cache;
//import org.hibernate.annotations.CacheConcurrencyStrategy;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;
//
//@Entity
//@Table(name = "st_related_attribute_category")
//@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
//public class RelatedAttributeCategory {
//    @NotNull
//    @Size(max = 50)
//    @Id
//    @Column(length = 50)
//    private String relatedAttributeCategory;
//}
