package at.fhv.jazzers.shared.dto;

import java.util.Objects;
import java.util.UUID;

public class CustomerOverviewDTO {
    private final UUID customerId;
    private final String firstName;
    private final String lastName;

    public CustomerOverviewDTO(UUID customerId, String firstName, String lastName) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerOverviewDTO that = (CustomerOverviewDTO) o;
        return customerId.equals(that.customerId) && firstName.equals(that.firstName) && lastName.equals(that.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, firstName, lastName);
    }
}
