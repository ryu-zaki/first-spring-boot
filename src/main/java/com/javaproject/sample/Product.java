package com.javaproject.sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Product implements Comparable<Product> {

    private String productName;
    private double price;
    private Map<String, Supplier> suppliers = new HashMap<>();

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public void addSupplier(String givenId, String supplierName, double tax) {
        Supplier supplier = new Supplier(supplierName, tax, givenId);
        suppliers.put(givenId, supplier);
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public void setProductName(String newName) {
        productName = newName;
    }

    public void setPrice(double newPrice) {
        price = newPrice;
    }

    public List<Supplier> getSuppliers() {

        List<Supplier> results = new ArrayList<Supplier>(suppliers.values());

        return results;
    }

    public void removeSupplier(String supplierId) {

        suppliers.remove(supplierId);
    }



    @Override
    public int compareTo(Product other) {

        int result = (int) (other.getPrice() - getPrice());

        return result;
    }

}
