package model;

public class Filial {
    private Integer id;
    private String filial;
    private String rua;
    private String numero;
    private String cidade;
    private String estado;
    private Boolean eh5Estrelas;

    public Filial(String filial, String rua, String numero, String cidade, String estado, boolean eh5Estrelas){
        this.filial = filial;
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.eh5Estrelas = eh5Estrelas;
    }

    public Filial(Integer id, String filial, String rua, String numero, String cidade, String estado, Boolean eh5Estrelas) {
        this.id = id;
        this.filial = filial;
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.eh5Estrelas = eh5Estrelas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFilial() {
        return filial;
    }

    public void setFilial(String filial) {
        this.filial = filial;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Boolean getEh5Estrelas() {
        return eh5Estrelas;
    }

    public void setEh5Estrelas(Boolean eh5Estrelas) {
        this.eh5Estrelas = eh5Estrelas;
    }

    @Override
    public String toString() {
        return "Filial{" +
                "id=" + id +
                ", filial='" + filial + '\'' +
                ", rua='" + rua + '\'' +
                ", numero='" + numero + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", eh5Estrelas=" + eh5Estrelas +
                '}';
    }
}
