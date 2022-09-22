package com.dh.felinos.model;

import org.apache.log4j.Logger;

import java.util.logging.Logger;

public class Leao {
    private static final Logger logger = Logger.getLogger(Leao.class);

    private String nome;
    private int idade;
    private boolean eAlfa;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isAlfa() {
        return eAlfa;
    }

    public void correr() {
        logger.info("O leão " + nome + " esta correndo!");
    }

    public void eMaiorQue10() throws Exception {
        if(idade > 10 && isAlfa()) {
            logger.info("O leão " + nome + " é maior de 10 anos!");
        }
        if(idade < 0) {
            logger.error("A idade não pode ser negativa!");
            throw new Exception();
        }
    }

    public void setAlfa(boolean eAlfa) {
        this.eAlfa = eAlfa;
    }
}
