package com.abato.ecommerce.org.abatoecommerce.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

@Entity
@AllArgsConstructor
@Getter
@NoArgsConstructor
@Setter
public class ProductCategory {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    @NotNull
    private int cId;
    @NotNull
    private String categoryName;

    @OneToMany(mappedBy = "category")
    @JsonManagedReference
    private List<Product> products;

    @ManyToOne
    @JoinColumn(name = "parentId")
    @JsonBackReference
    private ProductCategory parent_category;


    @Getter
    private String categoryCode;

    @OneToMany(mappedBy = "parent_category")
    @JsonManagedReference
    private List<ProductCategory > subcategories;

    public ProductCategory(String categoryName,int cId) {
        this.categoryName = categoryName;
        this.cId=cId;
    }

    @Override
    public String toString() {
        return "ProductCategory{" +
                "cId=" + cId +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductCategory category = (ProductCategory) o;
        return cId == category.cId &&
                Objects.equals(categoryName, category.categoryName) &&
                Objects.equals(products, category.products) &&
                Objects.equals(parent_category, category.parent_category) &&
                Objects.equals(subcategories, category.subcategories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cId, categoryName, products, parent_category, subcategories);
    }
}
