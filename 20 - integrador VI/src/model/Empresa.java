package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Empresa implements Serializable {
    private String razaoSocial;
    private String cnpj;
    ArrayList<Empregado> empregados;

    public Empresa(String razaoSocial, String cnpj) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public ArrayList<Empregado> getEmpregados() {
        return empregados;
    }

    public void setEmpregados(ArrayList<Empregado> empregados) {
        this.empregados = empregados;
    }
}

