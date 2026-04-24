package com.javaproject.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductsController {
    private List<Products> products = new ArrayList<Products>();

    @GetMapping("/")
    public List<Products> getAllProducts() {

        products.add(new Products("Milkita", 15));
        products.add(new Products("Peanut Butter", 50.3));
        products.add(new Products("Pandesal", 2.5));

        return products;
    }

    @GetMapping("/{name}")
    public Optional<Products> getProduct(@PathVariable String name) {

        return products.stream().filter(p -> p.getProductName().equals(name))
                .findFirst();
    }

    @PostMapping("/add")
    public String addProduct(@RequestBody Products newProduct) {
        products.add(newProduct);
        return "Product " + newProduct.getProductName() + " with a price of " + newProduct.getPrice() + " has been added";
    }
}
