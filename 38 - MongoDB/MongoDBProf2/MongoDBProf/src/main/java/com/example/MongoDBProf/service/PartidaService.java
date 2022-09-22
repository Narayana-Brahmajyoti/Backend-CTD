package com.example.MongoDBProf.service;

import com.example.MongoDBProf.model.PartidaEntity;
import com.example.MongoDBProf.model.TimeEntity;
import com.example.MongoDBProf.repository.IPartidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartidaService {

    @Autowired
    private IPartidaRepository partidaRepository;

    @Autowired
    private TimeService timeService;

    public PartidaEntity salvar(PartidaEntity partida) {
        TimeEntity time = timeService.buscarPorNome(partida.getTimeLocal().getNome());
        partida.setTimeLocal(time);

        time = timeService.buscarPorNome(partida.getTimeVisitante().getNome());
        partida.setTimeVisitante(time);

        return partidaRepository.save(partida);
    }

    public List<PartidaEntity> buscarTodos() {

        return partidaRepository.findAll();
    }
}
