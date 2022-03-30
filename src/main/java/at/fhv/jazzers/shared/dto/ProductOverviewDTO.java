package at.fhv.jazzers.shared.dto;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class ProductOverviewDTO implements Serializable {
    private final UUID productId;
    private final String interpret;
    private final String title;
    private final String medium;
    private final int stock;
    private final double price;

    public ProductOverviewDTO(UUID productId, String interpret, String title, String medium, int stock, double price) {
        this.productId = productId;
        this.interpret = interpret;
        this.title = title;
        this.medium = medium;
        this.stock = stock;
        this.price = price;
    }

    public UUID getProductId() {
        return productId;
    }

    public String getInterpret() {
        return interpret;
    }

    public String getTitle() {
        return title;
    }

    public String getMedium() {
        return medium;
    }

    public int getStock() {
        return stock;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductOverviewDTO that = (ProductOverviewDTO) o;
        return stock == that.stock && Double.compare(that.price, price) == 0 && productId.equals(that.productId) && interpret.equals(that.interpret) && title.equals(that.title) && medium.equals(that.medium);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, interpret, title, medium, stock, price);
    }
}
