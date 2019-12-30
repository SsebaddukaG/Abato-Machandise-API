package com.abato.ecommerce.org.abatoecommerce.model;

import lombok.AccessLevel;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ProductSize {
    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private int sizeId;
    /*General format for describing the product size*/
}
