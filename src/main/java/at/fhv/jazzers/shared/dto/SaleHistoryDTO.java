package at.fhv.jazzers.shared.dto;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class SaleHistoryDTO implements Serializable {
    private final UUID saleId;
    private final String firstName;
    private final String lastName;
    private final UUID productId;
    private final double totalPrice;
    private final int quantity;

    public SaleHistoryDTO(UUID saleId, CustomerDetailDTO firstName, CustomerDetailDTO lastName, ProductOverviewDTO product, int quantity) {
        this.saleId = saleId;
        this.firstName = firstName.getFirstName();
        this.lastName = lastName.getLastName();
        this.productId = product.getProductId();
        this.totalPrice = product.getPrice();
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

    public UUID getProductId() {
        return productId;
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
        SaleHistoryDTO that = (SaleHistoryDTO) o;
        return Double.compare(that.totalPrice, totalPrice) == 0 && quantity == that.quantity && saleId.equals(that.saleId) && firstName.equals(that.firstName) && lastName.equals(that.lastName) && productId.equals(that.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(saleId, firstName, lastName, productId, totalPrice, quantity);
    }
}
