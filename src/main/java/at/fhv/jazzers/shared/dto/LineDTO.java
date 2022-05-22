package at.fhv.jazzers.shared.dto;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class LineDTO implements Serializable {
    private UUID lineId;
    private UUID productId;
    private String productTitle;
    private double productPrice;
    private int amountPurchased;
    private int amountRefunded;

    public LineDTO() {

    }

    public LineDTO(UUID lineId, UUID productId, String productTitle, double productPrice, int amountPurchased, int amountRefunded) {
        this.lineId = lineId;
        this.productId = productId;
        this.productTitle = productTitle;
        this.productPrice = productPrice;
        this.amountPurchased = amountPurchased;
        this.amountRefunded = amountRefunded;
    }

    public UUID getLineId() {
        return lineId;
    }

    public UUID getProductId() {
        return productId;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public int getAmountPurchased() {
        return amountPurchased;
    }

    public int getAmountRefunded() {
        return amountRefunded;
    }

    public void setAmountRefunded(Integer refunded) { this.amountRefunded = refunded; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LineDTO lineDTO = (LineDTO) o;
        return Double.compare(lineDTO.productPrice, productPrice) == 0 && amountPurchased == lineDTO.amountPurchased && amountRefunded == lineDTO.amountRefunded && lineId.equals(lineDTO.lineId) && productId.equals(lineDTO.productId) && productTitle.equals(lineDTO.productTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lineId, productId, productTitle, productPrice, amountPurchased, amountRefunded);
    }
}