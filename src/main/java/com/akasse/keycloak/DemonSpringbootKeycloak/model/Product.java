package com.akasse.keycloak.DemonSpringbootKeycloak.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Product {

    private String id;
    private String reference;
    private double price;
}
