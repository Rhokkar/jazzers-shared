package at.fhv.jazzers.shared.api;

import at.fhv.jazzers.shared.dto.CustomerOverviewDTO;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface RMI_CustomerService extends Remote {
    List<CustomerOverviewDTO> search(String name) throws RemoteException;
    // Optional<CustomerDetailDTO> searchById(UUID customerId) throws RemoteException;
}
