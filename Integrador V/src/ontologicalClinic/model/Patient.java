package ontologicalClinic.model;

import java.util.Date;

public class Patient {

    private int id;
    private String name;
    private String lastName;
    private String rg;
    private Date registrationDate;
    private Integer idAddress;

    public Patient(Integer id, String name, String lastName, String rg, Date registrationDate, Integer idAddress) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.rg = rg;
        this.registrationDate = registrationDate;
        this.idAddress = idAddress;
    }

    public Patient(String name, String lastName, String rg, Date registrationDate, Integer idAddress) {
        this.name = name;
        this.lastName = lastName;
        this.rg = rg;
        this.registrationDate = registrationDate;
        this.idAddress = idAddress;
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

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Integer getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(Integer idAddress) {
        this.idAddress = idAddress;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", rg='" + rg + '\'' +
                ", registrationDate=" + registrationDate +
                ", idAddress=" + idAddress +
                '}';
    }
}
