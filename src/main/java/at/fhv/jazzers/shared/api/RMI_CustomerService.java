package at.fhv.jazzers.shared.api;

import at.fhv.jazzers.shared.dto.CustomerDetailDTO;
import at.fhv.jazzers.shared.dto.CustomerOverviewDTO;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import java.util.UUID;

public interface RMI_CustomerService extends Remote {
    CustomerDetailDTO searchById(UUID customerId) throws RemoteException;
    List<CustomerOverviewDTO> searchByName(String name) throws RemoteException;
}
