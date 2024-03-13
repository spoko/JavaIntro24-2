package oop;

public class Address {
    private String country;
    private String city;
    private int zipCode;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public Address(String country, String city, int zipCode){
        setCountry(country);
        setCity(city);
        setZipCode(zipCode);
    }

    public String printAddress(){
        return String.format("%s, %s and zip code: %d", country, city, zipCode);
    }
}
