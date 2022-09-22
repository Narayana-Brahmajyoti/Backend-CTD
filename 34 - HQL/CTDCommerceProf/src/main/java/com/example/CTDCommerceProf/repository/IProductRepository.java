package com.example.CTDCommerceProf.repository;

import com.example.CTDCommerceProf.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends JpaRepository<ProductEntity, Integer> {
}
