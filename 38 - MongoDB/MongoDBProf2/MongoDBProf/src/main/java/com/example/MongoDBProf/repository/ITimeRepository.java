package com.example.MongoDBProf.repository;

import com.example.MongoDBProf.model.TimeEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ITimeRepository extends MongoRepository<TimeEntity, String> {

    TimeEntity findByNome(String nome);

    @Query("{nome: ?0}")
    TimeEntity getByNome(String nome);
}
