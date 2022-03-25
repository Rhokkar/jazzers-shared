package at.fhv.jazzers.shared.dto;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class LineDTO implements Serializable {
    private final UUID productId;
    private final int amount;

    public LineDTO(UUID productId, int amount) {
        this.productId = productId;
        this.amount = amount;
    }

    public UUID productId() {
        return productId;
    }

    public int amount() {
        return amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LineDTO lineDTO = (LineDTO) o;
        return amount == lineDTO.amount && productId.equals(lineDTO.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, amount);
    }
}
