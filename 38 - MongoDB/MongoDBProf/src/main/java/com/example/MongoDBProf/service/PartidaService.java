package com.example.MongoDBProf.service;

import com.example.MongoDBProf.model.PartidaEntity;
import com.example.MongoDBProf.repository.IPartidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartidaService {

    @Autowired
    private IPartidaRepository partidaRepository;

    public PartidaEntity salvar(PartidaEntity partida) {
        return null;
    }

    public List<PartidaEntity> buscarTodos() {

        return null;
    }
}
