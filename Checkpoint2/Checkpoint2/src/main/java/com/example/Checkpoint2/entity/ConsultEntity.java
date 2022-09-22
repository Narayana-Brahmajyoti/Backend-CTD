package com.example.Checkpoint2.entity;

import java.util.Date;

public class ConsultEntity {

    private Integer id;
    private PatientEntity patient;
    private DentistEntity dentist;
    private Date dateHourConsult;
    //private Calendar dateHourConsult;


    public ConsultEntity(Integer id, PatientEntity patient, DentistEntity dentist, Date dateHourConsult) {
        this.id = id;
        this.patient = patient;
        this.dentist = dentist;
        this.dateHourConsult = dateHourConsult;
    }

    public ConsultEntity(PatientEntity patient, DentistEntity dentist, Date dateHourConsult) {
        this.patient = patient;
        this.dentist = dentist;
        this.dateHourConsult = dateHourConsult;
    }

    public ConsultEntity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PatientEntity getPatient() {
        return patient;
    }

    public void setPatient(PatientEntity patient) {
        this.patient = patient;
    }

    public DentistEntity getDentist() {
        return dentist;
    }

    public void setDentist(DentistEntity dentist) {
        this.dentist = dentist;
    }

    public Date getDateHourConsult() {
        return dateHourConsult;
    }

    public void setDateHourConsult(Date dateHourConsult) {
        this.dateHourConsult = dateHourConsult;
    }
}
