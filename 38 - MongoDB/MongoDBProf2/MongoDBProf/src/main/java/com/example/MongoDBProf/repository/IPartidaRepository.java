package com.example.MongoDBProf.repository;

import com.example.MongoDBProf.model.PartidaEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPartidaRepository extends MongoRepository<PartidaEntity, String> {
}
