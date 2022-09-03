package com.example.CTDCommerceProf.controller;

import com.example.CTDCommerceProf.entity.dto.CategoryDTO;
import com.example.CTDCommerceProf.entity.dto.ProductDTO;
import com.example.CTDCommerceProf.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductServiceImpl productService;

    @PostMapping
    public ProductDTO create(@RequestBody ProductDTO productDTO) {
        return productService.create(productDTO);
    }

    @GetMapping("/{id}")
    public ProductDTO getById(@PathVariable int id) {
        return productService.getById(id);
    }
}
