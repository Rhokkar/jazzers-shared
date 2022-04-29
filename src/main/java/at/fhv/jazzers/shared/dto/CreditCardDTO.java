package at.fhv.jazzers.shared.dto;

import java.io.Serializable;
import java.util.Objects;

public class CreditCardDTO implements Serializable {
    private final String creditCardNumber;
    private final String creditCardType;

    public CreditCardDTO(String creditCardNumber, String creditCardType) {
        this.creditCardNumber = creditCardNumber;
        this.creditCardType = creditCardType;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public String getCreditCardType() {
        return creditCardType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreditCardDTO that = (CreditCardDTO) o;
        return creditCardNumber.equals(that.creditCardNumber) && creditCardType.equals(that.creditCardType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(creditCardNumber, creditCardType);
    }
}
