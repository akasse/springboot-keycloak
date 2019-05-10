package com.akasse.keycloak.DemonSpringbootKeycloak.service;

import org.springframework.stereotype.Service;

import com.akasse.keycloak.DemonSpringbootKeycloak.model.Product;
import com.sun.tools.javac.util.List;

@Service
public class ProductService {

    public List<Product> getProducts(){
        return List.of(
                new Product("id1","XXABC",120.00),
                new Product("id2","XXZER",130.00),
                new Product("id3","XXRFR",110.00),
                new Product("id4","XXTER",140.00)
        );
    }
}
