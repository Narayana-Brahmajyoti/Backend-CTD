package com.example.CTDCommerceProf.controller;

import com.example.CTDCommerceProf.entity.dto.ProductDTO;
import com.example.CTDCommerceProf.exception.NotFoundException;
import com.example.CTDCommerceProf.exception.VariableNullException;
import com.example.CTDCommerceProf.service.impl.ProductServiceImpl;
import com.example.CTDCommerceProf.validacoes.ValidationProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductServiceImpl productService;

    private ValidationProduct validationProduct = new ValidationProduct();

    @PostMapping
    public ResponseEntity<ProductDTO> create(@RequestBody ProductDTO productDTO) throws VariableNullException {
        ResponseEntity responseEntity = null;

        Boolean erro = validationProduct.validationProductVariables(productDTO);

        if (erro) {
            ProductDTO productDTO1 = productService.create(productDTO);
            responseEntity = new ResponseEntity<>(productDTO1, HttpStatus.OK);
        }

        return responseEntity;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> getById(@PathVariable int id) throws NotFoundException {

        return new ResponseEntity<>(productService.getById(id), HttpStatus.OK);
    }

    @GetMapping
    public List<ProductDTO> getAll() {
        return productService.getAll();
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {

        return productService.delete(id);
    }

    @PutMapping
    public ProductDTO update(@RequestBody ProductDTO productDTO) {
        return productService.update(productDTO);
    }
}
