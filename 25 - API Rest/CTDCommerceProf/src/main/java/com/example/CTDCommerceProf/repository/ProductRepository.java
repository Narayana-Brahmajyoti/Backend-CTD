package com.example.CTDCommerceProf.repository;

import com.example.CTDCommerceProf.entity.ProductEntity;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ProductRepository {
    private static Map<Integer, ProductEntity> productMap = new HashMap<>();

    private static int idProduct = 1;

    public ProductEntity create(ProductEntity productEntity) {
        productEntity.setId(idProduct++);
        productMap.put(productEntity.getId(), productEntity);
        return productEntity;
    }

    public ProductEntity getById(int id) {
        return productMap.get(id);
    }
}
