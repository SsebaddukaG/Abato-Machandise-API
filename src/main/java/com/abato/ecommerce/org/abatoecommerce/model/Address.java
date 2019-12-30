package com.abato.ecommerce.org.abatoecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@AllArgsConstructor
@ToString
@Entity
public class Address {
    @Id
    @GeneratedValue
    private int addressId;
    private String street;
    private Long zipcode;
}
