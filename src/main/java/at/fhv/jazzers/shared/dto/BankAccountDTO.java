package at.fhv.jazzers.shared.dto;

import java.io.Serializable;
import java.util.Objects;

public class BankAccountDTO implements Serializable {
    private String city;
    private String bankCode;
    private String bic;
    private String iban;

    public BankAccountDTO() {

    }

    public BankAccountDTO(String city, String bankCode, String bic, String iban) {
        this.city = city;
        this.bankCode = bankCode;
        this.bic = bic;
        this.iban = iban;
    }

    public String getCity() {
        return city;
    }

    public String getBankCode() {
        return bankCode;
    }

    public String getBic() {
        return bic;
    }

    public String getIban() {
        return iban;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccountDTO that = (BankAccountDTO) o;
        return city.equals(that.city) && bankCode.equals(that.bankCode) && bic.equals(that.bic) && iban.equals(that.iban);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, bankCode, bic, iban);
    }
}
