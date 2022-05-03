package at.fhv.jazzers.shared.api;

import at.fhv.jazzers.shared.dto.LineDTO;
import at.fhv.jazzers.shared.dto.SaleHistoryEntryDetailDTO;
import at.fhv.jazzers.shared.dto.SaleHistoryEntryOverviewDTO;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import java.util.UUID;

public interface RMI_SaleService extends Remote {
    void purchase(UUID customerId, List<LineDTO> linesDTO) throws RemoteException;

    void refund(UUID saleId, List<LineDTO> linesDTO) throws RemoteException;

    List<SaleHistoryEntryOverviewDTO> saleHistoryFull() throws RemoteException;

    List<SaleHistoryEntryOverviewDTO> saleHistoryBy(String customerNameOrSaleId) throws RemoteException;

    SaleHistoryEntryDetailDTO saleDetail(UUID saleId) throws RemoteException;
}