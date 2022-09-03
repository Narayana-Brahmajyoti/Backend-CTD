package com.example.trainerProf.service.impl;

import com.example.trainerProf.model.Trainer;
import com.example.trainerProf.service.ITrainerService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TrainerServiceImpl implements ITrainerService {
    @Override
    public List<Trainer> listTrainer() {
        return Arrays.asList(new Trainer("Marcos"), new Trainer("Ana"));
    }
}
