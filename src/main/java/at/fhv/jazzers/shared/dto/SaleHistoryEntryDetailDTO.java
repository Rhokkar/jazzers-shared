package at.fhv.jazzers.shared.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class SaleHistoryEntryDetailDTO implements Serializable {
    private UUID customerId;
    private String firstName;
    private String lastName;
    private AddressDTO addressDTO;
    private UUID saleId;
    private LocalDate saleDate;
    private List<LineDTO> linesDTO;

    public SaleHistoryEntryDetailDTO() {

    }

    public SaleHistoryEntryDetailDTO(UUID customerId, String firstName, String lastName, AddressDTO addressDTO, UUID saleId, LocalDate saleDate, List<LineDTO> linesDTO) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.addressDTO = addressDTO;
        this.saleId = saleId;
        this.saleDate = saleDate;
        this.linesDTO = linesDTO;
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

    public AddressDTO getAddressDTO() {
        return addressDTO;
    }

    public UUID getSaleId() {
        return saleId;
    }

    public LocalDate getSaleDate() {
        return saleDate;
    }

    public List<LineDTO> getLinesDTO() {
        return linesDTO;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SaleHistoryEntryDetailDTO that = (SaleHistoryEntryDetailDTO) o;
        return Objects.equals(customerId, that.customerId) && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(addressDTO, that.addressDTO) && saleId.equals(that.saleId) && saleDate.equals(that.saleDate) && linesDTO.equals(that.linesDTO);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, firstName, lastName, addressDTO, saleId, saleDate, linesDTO);
    }
}
