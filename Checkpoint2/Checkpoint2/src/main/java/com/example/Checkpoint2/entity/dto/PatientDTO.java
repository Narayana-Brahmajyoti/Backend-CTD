package com.example.Checkpoint2.entity.dto;

import com.example.Checkpoint2.entity.AddressEntity;
import com.example.Checkpoint2.entity.DentistEntity;

import java.util.Date;

public class PatientDTO {

    private String name;
    private String lastName;
    private String rg;
    private Address address;
    private Date dateDischarge;
    private DentistEntity dentist;

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

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getDateDischarge() {
        return dateDischarge;
    }

    public void setDateDischarge(Date dateDischarge) {
        this.dateDischarge = dateDischarge;
    }

    public DentistEntity getDentist() {
        return dentist;
    }

    public void setDentist(DentistEntity dentist) {
        this.dentist = dentist;
    }
}
