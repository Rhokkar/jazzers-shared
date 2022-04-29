package at.fhv.jazzers.shared.dto;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class SaleHistoryEntryOverviewDTO implements Serializable {

    private final UUID saleId;
    private final String firstName;
    private final String lastName;
    private final double totalPrice;
    private final int quantity;

    public SaleHistoryEntryOverviewDTO(UUID saleId, String firstName, String lastName, double totalPrice, int quantity) {
        this.saleId = saleId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalPrice = totalPrice;
        this.quantity = quantity;
    }

    public UUID getSaleId() {
        return saleId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SaleHistoryEntryOverviewDTO that = (SaleHistoryEntryOverviewDTO) o;
        return Double.compare(that.totalPrice, totalPrice) == 0 && quantity == that.quantity && saleId.equals(that.saleId) && firstName.equals(that.firstName) && lastName.equals(that.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(saleId, firstName, lastName, totalPrice, quantity);
    }
}
