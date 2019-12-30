package com.abato.ecommerce.org.abatoecommerce.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
public class ProductDescription {
    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private int descriptionId;
    private String description;
    private String comment;
    private int views;
    private String review;
}
