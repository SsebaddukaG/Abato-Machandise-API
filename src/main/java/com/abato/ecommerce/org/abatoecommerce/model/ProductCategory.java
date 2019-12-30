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
    @Column(name="categoryId")
    private int categoryID;
    
    private String categoryName;

    @OneToMany
    private List<Product> productList;

    @OneToMany(mappedBy = "productCategories")
    private List<ProductCategory > productCategories;
}
