package com.codecool.uml.overloading;

import java.util.List;

class ProductCategory {
    private int id;
    private String name;
    private String department;
    private String description;

    public ProductCategory() {
    }

    public ProductCategory(String name, String department, String description) {
    }

    public int getId() {
        return 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Product> getProducts() {
        return null;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
