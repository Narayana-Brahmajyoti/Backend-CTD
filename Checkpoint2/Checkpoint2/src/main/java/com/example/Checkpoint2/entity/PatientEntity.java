package com.example.Checkpoint2.entity;

import java.util.Date;

public class PatientEntity {

    private Integer id;
    private String name;
    private String lastName;
    private String rg;
    private AddressEntity address;
    private Date dateDischarge;
    private DentistEntity dentist; // Integer idDentist;

    public PatientEntity(Integer id, String name, String lastName, String rg, AddressEntity address, Date dateDischarge, DentistEntity dentist) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.rg = rg;
        this.address = address;
        this.dateDischarge = dateDischarge;
        this.dentist = dentist;
    }

    public PatientEntity(String name, String lastName, String rg, AddressEntity address, Date dateDischarge, DentistEntity dentist) {
        this.name = name;
        this.lastName = lastName;
        this.rg = rg;
        this.address = address;
        this.dateDischarge = dateDischarge;
        this.dentist = dentist;
    }

    public PatientEntity() {
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

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public AddressEntity getAddress() {
        return address;
    }

    public void setAddress(AddressEntity address) {
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
