package com.javaproject.sample;

import java.util.List;

public class ProductService {

    public static void removeLowestTax(List<Product> products) {

        for (Product product: products) {

            double lowestTax = Double.MAX_VALUE;
            String lowestTaxId = null;

            for (Supplier supplier: product.getSuppliers()) {
               if (supplier.getTax() < lowestTax) {
                   lowestTax = supplier.getTax();
                   lowestTaxId = supplier.getSupplierId();
               }
            }

            if (lowestTaxId != null) {
                product.removeSupplier(lowestTaxId);
            }

        }

    }

}
