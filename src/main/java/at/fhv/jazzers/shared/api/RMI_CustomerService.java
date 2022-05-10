package at.fhv.jazzers.shared.api;

import at.fhv.jazzers.shared.dto.CustomerDetailDTO;
import at.fhv.jazzers.shared.dto.CustomerOverviewDTO;

import javax.ejb.Remote;
import java.util.List;
import java.util.UUID;

@Remote
public interface RMI_CustomerService {
    CustomerDetailDTO searchById(UUID customerId);
    List<CustomerOverviewDTO> searchByName(String name);
}
