package com.abato.ecommerce.org.abatoecommerce.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
public class Product {
    @NotNull
    private String productName;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private int pdtId;

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
    private ProductPrice productPrice_;

    @OneToOne
    @JsonBackReference
    private ProductCategory category;

    @OneToOne
    private ProductFlags flags;

}
