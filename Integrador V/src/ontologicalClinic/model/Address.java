package ontologicalClinic.model;

public class Address {


    private int id;
    private String street;
    private String number;
    private String city;
    private String district;

    public Address(Integer id, String street, String number, String city, String district) {
        this.id = id;
        this.street = street;
        this.number = number;
        this.city = city;
        this.district = district;
    }

    public Address(String street, String number, String city, String district) {
        this.street = street;
        this.number = number;
        this.city = city;
        this.district = district;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", number='" + number + '\'' +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                '}';
    }
}
