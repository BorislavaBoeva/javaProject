package objectClassInheritance;

public class Address {
    //Instance variable
    private String country;
    private String city;
    private int zipCode;

    //setters&getters
    public String getCountry() {
        return country;
    }

    //Validation
    public void setCountry(String country) {
        if (!country.isEmpty()) {
            this.country = country;
        } else {
            System.out.println("ERROR! Not valid entry!");
        }
    }

    //Validation
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (!city.isEmpty()) {
            this.city = city;
        } else {
            System.out.println("ERROR! Not valid entry!");
        }
    }

    public int getZipCode() {
        return zipCode;
    }

    //Validation
    public void setZipCode(int zipCode) {
        if (zipCode >= 1000 && zipCode <= 99999) {
            this.zipCode = zipCode;
        } else {
            System.out.println("ERROR! Not valid entry!");
        }
    }

    //constructor
    public Address(String country, String city, int zipCode) {
        setCountry(country);
        setCity(city);
        setZipCode(zipCode);
    }

    //methods
    public String printAddress() {
        return String.format("%s,%s and zip code: %d", country, city, zipCode);
    }
}

