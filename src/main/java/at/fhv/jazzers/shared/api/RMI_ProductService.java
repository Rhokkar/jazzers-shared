package at.fhv.jazzers.shared.api;

import at.fhv.jazzers.shared.dto.ProductOverviewDTO;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface RMI_ProductService extends Remote {
    List<ProductOverviewDTO> searchAnalog(String titleOrInterpret) throws RemoteException;
    List<ProductOverviewDTO> searchDigital(String titleOrInterpret) throws RemoteException;
}