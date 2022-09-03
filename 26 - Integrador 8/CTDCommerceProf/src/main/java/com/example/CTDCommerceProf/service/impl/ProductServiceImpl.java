package com.example.CTDCommerceProf.service.impl;

import com.example.CTDCommerceProf.entity.ProductEntity;
import com.example.CTDCommerceProf.entity.dto.CategoryDTO;
import com.example.CTDCommerceProf.entity.dto.ProductDTO;
import com.example.CTDCommerceProf.repository.ProductRepository;
import com.example.CTDCommerceProf.service.ICommerceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ICommerceService<ProductDTO> {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryServiceImpl categoryService;

    @Override
    public ProductDTO create(ProductDTO productDTO) {
        ProductEntity productEntity = new ProductEntity(productDTO);


        String categoryName = productDTO.getCategory();
        int categoryId = categoryService.getByName(categoryName);
        productEntity.setCategoryId(categoryId);


        //productEntity.setCategoryId(categoryService.getByName(productDTO.getCategory()));
        if (productEntity.getCategoryId() != 0)
            productRepository.create(productEntity);

        return productDTO;
    }

    @Override
    public ProductDTO getById(int id) {
        ProductEntity productEntity = productRepository.getById(id);
        ProductDTO productDTO = new ProductDTO(productEntity);


        String categoryName = getNameCategory(productEntity);
        productDTO.setCategory(categoryName);



       //productDTO.setCategory(categoryService.getById(productEntity.getCategoryId()).getName());
        return productDTO;
    }

    private String getNameCategory(ProductEntity productEntity) {
        int categoryId = productEntity.getCategoryId();
        CategoryDTO categoryDTO = categoryService.getById(categoryId);
        String categoryName = categoryDTO.getName();
        return categoryName;
    }

    @Override
    public List<ProductDTO> getAll() {
        List<ProductEntity> productEntities = productRepository.getAll();
        List<ProductDTO> productDTOs = new ArrayList<>();

        for (ProductEntity product : productEntities) {
            String categoryName = getNameCategory(product);
            ProductDTO productDTO = new ProductDTO(product);
            productDTO.setCategory(categoryName);
            productDTOs.add(productDTO);
        }

        return productDTOs;
    }

    @Override
    public String delete(int id) {
        return productRepository.delete(id);
    }

    @Override
    public ProductDTO update(ProductDTO productDTO, int id) {
        ProductEntity productEntity = new ProductEntity(productDTO);
        String categoryName = productDTO.getCategory();
        int categoryId = categoryService.getByName(categoryName);
        productEntity.setCategoryId(categoryId);
        productEntity.setId(id);

        if (productEntity.getCategoryId() != 0)
            productRepository.create(productEntity);

        return productDTO;
    }


}
