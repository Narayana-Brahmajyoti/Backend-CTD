package com.example.MongoDBProf.service;

import com.example.MongoDBProf.model.PartidaEntity;
import com.example.MongoDBProf.model.TimeEntity;
import com.example.MongoDBProf.repository.ITimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimeService {

    @Autowired
    private ITimeRepository timeRepository;

    public TimeEntity salvar(TimeEntity time) {
        return null;
    }

    public List<TimeEntity> buscarTodos() {

        return null;
    }

    public TimeEntity buscarPorNome(String nome) {
        return null;
    }
}
