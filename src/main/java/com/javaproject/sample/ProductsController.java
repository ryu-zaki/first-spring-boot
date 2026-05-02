package com.javaproject.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductsController {
    private List<Product> products = new ArrayList<Product>();

    public ProductsController() {
        products.add(new Product("Milkita", 15));
        products.add(new Product("Peanut Butter", 50.3));
        products.add(new Product("Pandesal", 2.5));

        Product prod = products.getFirst();
        prod.addSupplier("1", "WL", 200);
        prod.addSupplier("2", "J&J", 90);
        prod.addSupplier("3", "Lemon", 160);
        Product prod2 = products.get(1);

        prod2.addSupplier("4","WL", 120);
        prod2.addSupplier("5","J&J", 190);
        prod2.addSupplier("6","Lemon", 110);

        Product prod3 = products.get(2);
        prod3.addSupplier("7","WL", 70);
        prod3.addSupplier("8","J&J", 170);
        prod3.addSupplier("9","Lemon", 130);
    }

    @GetMapping("/")
    public List<Product> getAllProducts() {
        Collections.sort(products);

        return products;
    }

    @GetMapping("/remove")
    public List<Product> getUpdatedProducts() {
        ProductService.removeLowestTax(products);
        return products;
    }

    @GetMapping("/{name}")
    public Optional<Product> getProduct(@PathVariable String name, @RequestParam String archive) {
        System.out.println("is Archive: " + archive);
        return products.stream().filter(p -> p.getProductName().equals(name))
                .findFirst();
    }

    @PostMapping("/add")
    public String addProduct(@RequestBody Product newProduct) {
        products.add(newProduct);
        return "Product " + newProduct.getProductName() + " with a price of " + newProduct.getPrice() + " has been added";
    }

    @PutMapping("/update")
    public String editProduct(@RequestBody Product updatedProduct) {

        for (Product product: products) {

            if (product.getProductName().equals(updatedProduct.getProductName())) {
                product.setProductName(updatedProduct.getProductName());
                product.setPrice(updatedProduct.getPrice());
            }

        }

        return updatedProduct.getProductName() + " has been updated.";
    }


}
