package com.example.trainerProf.controller;

import com.example.trainerProf.model.Trainer;
import com.example.trainerProf.service.impl.TrainerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/trainer")
public class TrainerController {

    @Autowired
    private TrainerServiceImpl trainerService;

    @GetMapping
    public List<Trainer> getTrainer() {
        return trainerService.listTrainer();
    }
}
