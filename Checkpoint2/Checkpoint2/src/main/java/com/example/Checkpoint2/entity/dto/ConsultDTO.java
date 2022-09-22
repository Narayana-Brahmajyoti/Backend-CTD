package com.example.Checkpoint2.entity.dto;

import com.example.Checkpoint2.entity.DentistEntity;

import java.util.Date;

public class ConsultDTO {

    private Patient patient;
    private DentistEntity dentist;
    private Date dateHourConsult;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
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
