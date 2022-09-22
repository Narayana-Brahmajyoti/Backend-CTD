package com.example.MongoDBProf.controller;

import com.example.MongoDBProf.model.PartidaEntity;
import com.example.MongoDBProf.service.PartidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/partidas")
public class PartidaController {

    @Autowired
    private PartidaService partidaService;

    @PostMapping
    public PartidaEntity salvar(@RequestBody PartidaEntity partida) {

        return partidaService.salvar(partida);
    }

    @GetMapping
    public List<PartidaEntity> buscarTodos() {

        return partidaService.buscarTodos();
    }
}
