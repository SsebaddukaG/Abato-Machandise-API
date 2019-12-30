package com.abato.ecommerce.org.abatoecommerce.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@AllArgsConstructor
@Getter
@Entity
public class ProductFlags {
    /*
    * add other boolean attributes in case any*/
    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private int flagId;
    private boolean isPromoFront;
}
