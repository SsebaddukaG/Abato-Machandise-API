package com.abato.ecommerce.org.abatoecommerce.model;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor
@Setter
@ToString
@Entity
public class Discount {
    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private int discountId;
    private String discountDescription;
    private double discountOffered;
}
