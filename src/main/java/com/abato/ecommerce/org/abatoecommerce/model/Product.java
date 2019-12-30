package com.abato.ecommerce.org.abatoecommerce.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
public class Product {
    private String productName;
    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private int productID;

    private String color;
    private Long productNumber;
    private LocalDate yearOfManufacturing;

    private String tag;

    @OneToOne
    private Manufacturer manufacturer;
    @OneToOne
    private ProductDescription productDescription;
    @OneToOne
    private ProductSize productSize;

    @OneToOne
    private ProductPrice productPrice;

    @OneToMany(mappedBy = "productList")
    private List<ProductCategory> categoryList;

    @OneToOne
    private ProductFlags flags;

}
