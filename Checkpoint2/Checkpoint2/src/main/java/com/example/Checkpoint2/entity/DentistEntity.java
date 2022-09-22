package com.example.Checkpoint2.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

public class DentistEntity {

    private Integer id;
    private String name;
    private String lastName;
    private String enroll;

    @JsonIgnore // Está lista não salva quando cria o dentista,
    // só vai existir no conceito quando fizer uma busca pelo dentista,
    // para trazer tds os seus pacientes.
    private List<PatientEntity> patientList;

    public DentistEntity(Integer id, String name, String lastName, String enroll, List<PatientEntity> patientList) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.enroll = enroll;
        this.patientList = patientList;
    }

    public DentistEntity(String name, String lastName, String enroll, List<PatientEntity> patientList) {
        this.name = name;
        this.lastName = lastName;
        this.enroll = enroll;
        this.patientList = patientList;
    }

    public DentistEntity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEnroll() {
        return enroll;
    }

    public void setEnroll(String enroll) {
        this.enroll = enroll;
    }

    public List<PatientEntity> getPatientList() {
        return patientList;
    }

    public void setPatientList(List<PatientEntity> patientList) {
        this.patientList = patientList;
    }
}
