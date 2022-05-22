package at.fhv.jazzers.shared.dto;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class CustomerAccountDTO implements Serializable {
    private UUID customerId;
    private String firstName;
    private String lastName;
    private String iban;

    public CustomerAccountDTO() {

    }

    public CustomerAccountDTO(UUID customerId, String firstName, String lastName, String iban) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.iban = iban;
    }

    public UUID getCustomerId() {
        return customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getIban() {
        return iban;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerAccountDTO that = (CustomerAccountDTO) o;
        return customerId.equals(that.customerId) && firstName.equals(that.firstName) && lastName.equals(that.lastName) && iban.equals(that.iban);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, firstName, lastName, iban);
    }
}
