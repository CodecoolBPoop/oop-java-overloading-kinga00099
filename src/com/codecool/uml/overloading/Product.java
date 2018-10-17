package com.codecool.uml.overloading;

import java.util.Currency;
import java.util.List;

class Product {
    private int id;
    private String name;
    private float defaultPrice;
    private Currency defaultCurrency;
    private ProductCategory productCategory;
    private Supplier supplier;
    private List<Product> productList;

    public Product() {
    }

    public Product(String name, float defaultPrice, Currency defaultCurrency) {
    }

    public int getId() {
        return 0;
    }

    public String getName() {
        return null;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDefaultPrice() {
        return 0;
    }

    public void setDefaultPrice(float defaultPrice) {
        this.defaultPrice = defaultPrice;
    }

    public float getDefaultCurrency() {
        return 0;
    }

    public void setDefaultCurrency(Currency defaultCurrency) {
        this.defaultCurrency = defaultCurrency;
    }

    public ProductCategory getProductCategory() {
        return null;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public Supplier getSupplier() {
        return null;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public List<Product> getAllProductsBy(ProductCategory productCategory) {
        return null;
    }

    public List<Product> getAllProductsBy(Supplier supplier) {
        return null;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
