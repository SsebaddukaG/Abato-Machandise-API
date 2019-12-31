package com.abato.ecommerce.org.abatoecommerce.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@Getter
@NoArgsConstructor
@Setter
public class ProductCategory {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Setter(AccessLevel.NONE)
    private int cId;

    private String categoryName;

    @OneToMany(mappedBy = "categories")
    private List<Product> products;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "parentId")
    private ProductCategory parent_category;

    @OneToMany(mappedBy = "parent_category", cascade={CascadeType.ALL})
    private List<ProductCategory > subcategories;
}
