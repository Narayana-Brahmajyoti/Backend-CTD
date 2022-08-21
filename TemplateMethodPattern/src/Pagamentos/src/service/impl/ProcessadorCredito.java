package service.impl;

import model.Cartao;
import model.CartaoCredito;
import service.PagamentoService;

public class ProcessadorCredito extends PagamentoService {
    @Override
    protected Boolean autorizarPgto(Cartao cartao, Double quantia) {
        CartaoCredito cartaoPorAutorizar = ((CartaoCredito) cartao);
        Double saldoDisponivel = cartaoPorAutorizar.getLimite()-cartaoPorAutorizar.getSaldoUtilizado();

        return (saldoDisponivel >= quantia);
    }
}
