package com.javaproject.sample;

public class Supplier {

    private String name;
    private double tax;

    public Supplier(String name, double tax) {
        setName(name);
        setTax(tax);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public double getTax() {
        return tax;
    }

}
