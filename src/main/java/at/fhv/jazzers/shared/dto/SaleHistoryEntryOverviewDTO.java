package at.fhv.jazzers.shared.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

public class SaleHistoryEntryOverviewDTO implements Serializable {
    private final UUID saleId;
    private final String firstName;
    private final String lastName;
    private final double totalPrice;
    private final int quantity;
    private final LocalDate date;

    public SaleHistoryEntryOverviewDTO(UUID saleId, String firstName, String lastName, double totalPrice, int quantity, LocalDate date) {
        this.saleId = saleId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalPrice = totalPrice;
        this.quantity = quantity;
        this.date = date;
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

    public LocalDate getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SaleHistoryEntryOverviewDTO that = (SaleHistoryEntryOverviewDTO) o;
        return Double.compare(that.totalPrice, totalPrice) == 0 && quantity == that.quantity && saleId.equals(that.saleId) && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && date.equals(that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(saleId, firstName, lastName, totalPrice, quantity, date);
    }
}
