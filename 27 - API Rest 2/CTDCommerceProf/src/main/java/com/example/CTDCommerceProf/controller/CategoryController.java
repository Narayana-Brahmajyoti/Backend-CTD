package com.example.CTDCommerceProf.controller;

import com.example.CTDCommerceProf.entity.dto.CategoryDTO;
import com.example.CTDCommerceProf.service.impl.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryServiceImpl categoryService;

    @PostMapping
    public CategoryDTO create(@RequestBody CategoryDTO categoryDTO) {
        return categoryService.create(categoryDTO);
    }

    @GetMapping("/{id}")
    public CategoryDTO getById(@PathVariable int id) {
        return categoryService.getById(id);
    }
}
