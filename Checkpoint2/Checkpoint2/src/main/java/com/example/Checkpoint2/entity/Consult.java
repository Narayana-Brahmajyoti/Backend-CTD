package com.example.Checkpoint2.entity;

import java.util.Calendar;
import java.util.Date;

public class Consult {

    private Integer id;
    private Patient patient;
    private Dentist dentist;
    private Date dateHourConsult;
    //private Calendar dateHourConsult;


    public Consult(Integer id, Patient patient, Dentist dentist, Date dateHourConsult) {
        this.id = id;
        this.patient = patient;
        this.dentist = dentist;
        this.dateHourConsult = dateHourConsult;
    }

    public Consult(Patient patient, Dentist dentist, Date dateHourConsult) {
        this.patient = patient;
        this.dentist = dentist;
        this.dateHourConsult = dateHourConsult;
    }

    public Consult() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Dentist getDentist() {
        return dentist;
    }

    public void setDentist(Dentist dentist) {
        this.dentist = dentist;
    }

    public Date getDateHourConsult() {
        return dateHourConsult;
    }

    public void setDateHourConsult(Date dateHourConsult) {
        this.dateHourConsult = dateHourConsult;
    }
}
