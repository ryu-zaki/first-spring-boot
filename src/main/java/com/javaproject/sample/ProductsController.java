package com.javaproject.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductsController {

    @GetMapping("/products")
    public List<Products> getAllProducts() {
        List<Products> products = new ArrayList<Products>();
        products.add(new Products("Milkita", 15));
        products.add(new Products("Peanut Butter", 50.3));
        products.add(new Products("Pandesal", 2.5));

        return products;
    }

}
