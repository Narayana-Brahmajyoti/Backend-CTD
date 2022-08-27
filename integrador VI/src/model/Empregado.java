package model;

import java.io.Serializable;

public class Empregado implements Serializable {
    private String nome;
    private String sobreNome;
    private String rg;
    private double salario;

    public Empregado(String nome, String sobreNome, String rg, double salario) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.rg = rg;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
