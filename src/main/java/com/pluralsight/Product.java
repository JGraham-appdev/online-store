package com.pluralsight;

public class Product {

    public String sku;
    public String product;
    public String name;

    public Product(String sku, String product, String name){
        this.sku = sku;
        this.product = product;
        this.name = name;
    }

    //getters and setters
    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
