package service.impl;

import model.Cartao;
import model.CartaoDebito;
import service.PagamentoService;

public class ProcessadorDebito extends PagamentoService {

    @Override
    protected Boolean autorizarPgto(Cartao cartao, Double quantia) {
        CartaoDebito cartaoADebitar = ((CartaoDebito) cartao);
        return (cartaoADebitar.getSaldo() >= quantia);

    }
}
