package com.example.Checkpoint2.entity.dto;

import com.example.Checkpoint2.entity.Dentist;
import com.example.Checkpoint2.entity.Patient;

import java.util.Date;

public class ConsultDTO {

    private Patient patient;
    private Dentist dentist;
    private Date dateHourConsult;

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
