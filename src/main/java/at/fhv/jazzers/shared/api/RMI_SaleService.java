package at.fhv.jazzers.shared.api;

import at.fhv.jazzers.shared.dto.LineDTO;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import java.util.UUID;

public interface RMI_SaleService extends Remote {
    void purchase(UUID customerId, List<LineDTO> linesDTO) throws RemoteException;

    void refund(UUID customerId, List<LineDTO> linesDTO) throws RemoteException;

    void saleHistoryFull() throws RemoteException;

    void saleHistoryForCustomer(UUID customerId) throws RemoteException;
}
