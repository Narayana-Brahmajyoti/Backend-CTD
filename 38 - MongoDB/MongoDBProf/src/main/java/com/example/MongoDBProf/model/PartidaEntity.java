package com.example.MongoDBProf.model;

public class PartidaEntity {

    private String id;
    private String resultado;
    private Status status;
    private TimeEntity timeLocal;
    private TimeEntity timeVisitante;

    public String getId() {
        return id;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public TimeEntity getTimeLocal() {
        return timeLocal;
    }

    public void setTimeLocal(TimeEntity timeLocal) {
        this.timeLocal = timeLocal;
    }

    public TimeEntity getTimeVisitante() {
        return timeVisitante;
    }

    public void setTimeVisitante(TimeEntity timeVisitante) {
        this.timeVisitante = timeVisitante;
    }
}
