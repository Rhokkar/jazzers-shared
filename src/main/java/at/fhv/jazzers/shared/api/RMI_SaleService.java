package at.fhv.jazzers.shared.api;

import at.fhv.jazzers.shared.dto.LineDTO;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import java.util.UUID;

public interface RMI_SaleService extends Remote {
    void saveTransaction(String saleType, UUID customerId, List<LineDTO> linesDTO) throws RemoteException;
}
