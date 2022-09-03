package com.example.CTDCommerceProf.service.impl;

import com.example.CTDCommerceProf.entity.CategoryEntity;
import com.example.CTDCommerceProf.entity.dto.CategoryDTO;
import com.example.CTDCommerceProf.repository.CategoryRepository;
import com.example.CTDCommerceProf.service.ICommerceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements ICommerceService<CategoryDTO> {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public CategoryDTO create(CategoryDTO categoryDTO) {
        CategoryEntity categoryEntity = new CategoryEntity(categoryDTO);
        categoryRepository.create(categoryEntity);
        return categoryDTO;
    }

    @Override
    public CategoryDTO getById(int id) {
        return new CategoryDTO(categoryRepository.getById(id));
    }

    public int getByName(String name) {
        return categoryRepository.getByName(name);
    }
}
