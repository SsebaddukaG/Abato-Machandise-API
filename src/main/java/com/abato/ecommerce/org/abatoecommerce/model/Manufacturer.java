package com.abato.ecommerce.org.abatoecommerce.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@AllArgsConstructor
@Getter
@ToString
@Entity
public class Manufacturer {
    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private int manufactureID;
    private String manufacturerName;
    private String countryOfOrigin;

    @OneToOne
    private Address address;

}
