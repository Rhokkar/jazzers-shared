package at.fhv.jazzers.shared.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

public class CustomerDetailDTO implements Serializable {
    private UUID customerId;
    private String firstName;
    private String lastName;
    private String gender;
    private LocalDate birthDate;
    private String email;
    private String phoneNumber;
    private String mobileNumber;
    private AddressDTO addressDTO;
    private BankAccountDTO bankAccountDTO;
    private CreditCardDTO creditCardDTO;

    public CustomerDetailDTO() {

    }

    public CustomerDetailDTO(UUID customerId, String firstName, String lastName, String gender, LocalDate birthDate, String email, String phoneNumber, String mobileNumber, AddressDTO addressDTO, BankAccountDTO bankAccountDTO, CreditCardDTO creditCardDTO) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.mobileNumber = mobileNumber;
        this.addressDTO = addressDTO;
        this.bankAccountDTO = bankAccountDTO;
        this.creditCardDTO = creditCardDTO;
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

    public String getGender() {
        return gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public AddressDTO getAddressDTO() {
        return addressDTO;
    }

    public BankAccountDTO getBankAccountDTO() {
        return bankAccountDTO;
    }

    public CreditCardDTO getCreditCardDTO() {
        return creditCardDTO;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerDetailDTO that = (CustomerDetailDTO) o;
        return customerId.equals(that.customerId) && firstName.equals(that.firstName) && lastName.equals(that.lastName) && gender.equals(that.gender) && birthDate.equals(that.birthDate) && email.equals(that.email) && phoneNumber.equals(that.phoneNumber) && mobileNumber.equals(that.mobileNumber) && addressDTO.equals(that.addressDTO) && bankAccountDTO.equals(that.bankAccountDTO) && creditCardDTO.equals(that.creditCardDTO);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, firstName, lastName, gender, birthDate, email, phoneNumber, mobileNumber, addressDTO, bankAccountDTO, creditCardDTO);
    }
}
