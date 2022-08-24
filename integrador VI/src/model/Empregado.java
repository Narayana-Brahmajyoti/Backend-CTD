package model;

import java.io.Serializable;

public class Empregado implements Serializable {
    private String nome;
    private String sobreNome;
    private String rg;
    private Double salario;

    public Empregado(String nome, String sobreNome, String rg, Double salario) {
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

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empregado{" +
                "nome='" + nome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", rg='" + rg + '\'' +
                ", salario=" + salario +
                '}';
    }
}
