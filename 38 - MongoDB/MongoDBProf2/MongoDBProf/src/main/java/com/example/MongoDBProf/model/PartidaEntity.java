package com.example.MongoDBProf.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "partidas")
public class PartidaEntity {

    @Id
    private String id;
    private String resultado;
    private Status status;

    @Field(name = "time_local")
    private TimeEntity timeLocal;

    @Field(name = "time_visitante")
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
