package com.example.CTDCommerceProf.entity.dto;

import com.example.CTDCommerceProf.entity.ProductEntity;

public class ProductDTO {
    private String title;
    private double price;
    private String description;
    private String image;
    private String category;

    public ProductDTO(ProductEntity productEntity) {
        this.title = productEntity.getTitle();
        this.price = productEntity.getPrice();
        this.description = productEntity.getDescription();
        this.image = productEntity.getImage();
    }

    public ProductDTO() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
