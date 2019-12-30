package com.abato.ecommerce.org.abatoecommerce.model;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@NoArgsConstructor
@Setter
@ToString
@Entity
public class ProductPrice {
    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private int priceId;
    private double price;
    private double productTax;

    @OneToOne
    private Discount discount;

    public double totalUnitPrice(){
        /*total price calculation after tax and discount to performed here*/
        return 0;
    }
}
