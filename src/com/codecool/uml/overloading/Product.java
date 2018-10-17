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
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDefaultPrice() {
        return defaultPrice;
    }

    public void setDefaultPrice(float defaultPrice) {
        this.defaultPrice = defaultPrice;
    }

    public Currency getDefaultCurrency(){
        return defaultCurrency;
    }

    public void setDefaultCurrency(Currency defaultCurrency) {
        this.defaultCurrency = defaultCurrency;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public Supplier getSupplier() {
        return supplier;
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
