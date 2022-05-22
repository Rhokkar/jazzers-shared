package at.fhv.jazzers.shared.dto;

import java.io.Serializable;
import java.util.Objects;

public class AddressDTO implements Serializable {
    private String country;
    private String locality;
    private String postalCode;
    private String street;
    private String houseNumber;

    public AddressDTO() {

    }

    public AddressDTO(String country, String locality, String postalCode, String street, String houseNumber) {
        this.country = country;
        this.locality = locality;
        this.postalCode = postalCode;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public String getCountry() {
        return country;
    }

    public String getLocality() {
        return locality;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getStreet() {
        return street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressDTO that = (AddressDTO) o;
        return country.equals(that.country) && locality.equals(that.locality) && postalCode.equals(that.postalCode) && street.equals(that.street) && houseNumber.equals(that.houseNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, locality, postalCode, street, houseNumber);
    }
}
