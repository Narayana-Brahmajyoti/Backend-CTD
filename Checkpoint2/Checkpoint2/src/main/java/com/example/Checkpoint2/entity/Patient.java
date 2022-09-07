package com.example.Checkpoint2.entity;

import java.util.Date;

public class Patient {

    private Integer id;
    private String name;
    private String lastName;
    private String rg;
    private Address address;
    private Date dateDischarge;
    private  Dentist dentist; // Integer idDentist;

    public Patient(Integer id, String name, String lastName, String rg, Address address, Date dateDischarge, Dentist dentist) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.rg = rg;
        this.address = address;
        this.dateDischarge = dateDischarge;
        this.dentist = dentist;
    }

    public Patient(String name, String lastName, String rg, Address address, Date dateDischarge, Dentist dentist) {
        this.name = name;
        this.lastName = lastName;
        this.rg = rg;
        this.address = address;
        this.dateDischarge = dateDischarge;
        this.dentist = dentist;
    }

    public Patient() {
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

    public Dentist getDentist() {
        return dentist;
    }

    public void setDentist(Dentist dentist) {
        this.dentist = dentist;
    }
}
