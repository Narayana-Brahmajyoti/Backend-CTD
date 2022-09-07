package com.example.Checkpoint2.entity;

import java.util.List;

public class Dentist {

    private Integer id;
    private String name;
    private String lastName;
    private String enroll;
    private List<Patient> patientList;

    public Dentist(Integer id, String name, String lastName, String enroll, List<Patient> patientList) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.enroll = enroll;
        this.patientList = patientList;
    }

    public Dentist(String name, String lastName, String enroll, List<Patient> patientList) {
        this.name = name;
        this.lastName = lastName;
        this.enroll = enroll;
        this.patientList = patientList;
    }

    public Dentist() {
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

    public List<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(List<Patient> patientList) {
        this.patientList = patientList;
    }
}
