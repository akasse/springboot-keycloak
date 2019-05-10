package com.akasse.keycloak.DemonSpringbootKeycloak.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akasse.keycloak.DemonSpringbootKeycloak.model.Product;
import com.akasse.keycloak.DemonSpringbootKeycloak.service.ProductService;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/products")
    public List<Product> getProducts() {
        return productService.getProducts();
    }

}
