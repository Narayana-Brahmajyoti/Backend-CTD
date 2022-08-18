package test;

import dao.ConfiguracaoJDBC;
import dao.impl.FilialDaoImpl;
import model.Filial;
import org.junit.jupiter.api.Test;
import service.FilialService;

import static org.junit.jupiter.api.Assertions.*;

class FilialServiceTest {
    private FilialService filialService = new FilialService(new FilialDaoImpl(new ConfiguracaoJDBC()));

    @Test
    public void salvarFilial() {
        Filial filialParadiso = new Filial("Paradiso", "Paulista", "323", "Sao Paulo", "SP", true);
        filialService.salvar(filialParadiso);
        assertTrue(filialParadiso.getId() != null);

        Filial filialAugusta = new Filial("Augusta", "Paulista", "31543", "Rio de janeiro", "RJ", false);
        filialService.salvar(filialAugusta);
        assertTrue(filialAugusta.getId() != null);

        Filial filialVerdemar = new Filial("Verdemar", "Agosto", "343", "Rio de janeiro", "RJ", true);
        filialService.salvar(filialVerdemar);
        assertTrue(filialVerdemar.getId() != null);

        Filial filialJardins = new Filial("Jardins", "Carangola", "46", "Contagem", "MG", false);
        filialService.salvar(filialJardins);
        assertTrue(filialJardins.getId() != null);

        Filial filialBeijaFlor = new Filial("Beija-Flor", "Rio Branco", "103", "Salvador", "BA", true);
        filialService.salvar(filialBeijaFlor);
        assertTrue(filialBeijaFlor.getId() != null);
    }
}