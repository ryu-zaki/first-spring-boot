package com.javaproject.sample;

public class Supplier {

    private String supplierId;
    private String name;
    private double tax;

    public Supplier(String name, double tax, String supplierId) {
        setName(name);
        setTax(tax);
        setSupplierId(supplierId);

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public void setSupplierId(String id) {
        this.supplierId = id;
    }

    public String getName() {
        return name;
    }

    public double getTax() {
        return tax;
    }

    public String getSupplierId() {
        return supplierId;
    }

}
