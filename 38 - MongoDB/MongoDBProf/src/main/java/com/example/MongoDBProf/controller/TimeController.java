package com.example.MongoDBProf.controller;

import com.example.MongoDBProf.model.TimeEntity;
import com.example.MongoDBProf.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/times")
public class TimeController {

    @Autowired
    private TimeService timeService;

    @PostMapping
    public TimeEntity salvar(@RequestBody TimeEntity time) {

        return timeService.salvar(time);
    }

    @GetMapping
    public List<TimeEntity> buscarTodos() {

        return timeService.buscarTodos();
    }

    @GetMapping("/{nome}")
    public TimeEntity buscarPorNome(@PathVariable String nome) {

        return timeService.buscarPorNome(nome);
    }
}
