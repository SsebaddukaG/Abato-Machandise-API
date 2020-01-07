package com.abato.ecommerce.org.abatoecommerce.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
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
    private int cId;

    private String categoryName;

    @OneToMany(mappedBy = "categories")
    private List<Product> products;

    @ManyToOne
    @JoinColumn(name = "parentId")
    @JsonManagedReference
    private ProductCategory parent_category;

    @OneToMany(mappedBy = "parent_category")
    @JsonBackReference
    private List<ProductCategory > subcategories;

    public ProductCategory(String categoryName,int cId) {
        this.categoryName = categoryName;
        this.cId=cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getcId() {
        return cId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public ProductCategory getParent_category() {
        return parent_category;
    }

    public void setParent_category(ProductCategory parent_category) {
        this.parent_category = parent_category;
    }

    public List<ProductCategory> getSubcategories() {
        return subcategories;
    }

    public void setSubcategories(List<ProductCategory> subcategories) {
        this.subcategories = subcategories;
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
