package com.example.CTDCommerceProf.controller;

import com.example.CTDCommerceProf.entity.dto.CategoryDTO;
import com.example.CTDCommerceProf.entity.dto.ProductDTO;
import com.example.CTDCommerceProf.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping
    public List<ProductDTO> getAll() {
        return productService.getAll();
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {

        return productService.delete(id);
    }

    @PutMapping("/{id}")
    public ProductDTO update(@RequestBody ProductDTO productDTO, @PathVariable int id) {
        return productService.update(productDTO, id);
    }
}
