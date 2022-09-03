package com.example.CTDCommerceProf.entity.dto;

import com.example.CTDCommerceProf.entity.CategoryEntity;

public class CategoryDTO {
    private String name;

    public CategoryDTO(CategoryEntity categoryEntity) {
        this.name = categoryEntity.getName();
    }

    public CategoryDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
