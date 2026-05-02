package com.javaproject.sample;

public class Products {

    private String productName;
    private double price;

    public Products(String productName, double price) {
        this.productName = productName;
        this.price = price;
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

}
