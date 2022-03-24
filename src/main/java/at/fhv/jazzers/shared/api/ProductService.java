package at.fhv.jazzers.shared.api;

import at.fhv.jazzers.shared.dto.ProductOverviewDTO;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface ProductService extends Remote {
    List<ProductOverviewDTO> searchMP3sByTitleOrInterpret(String searchString) throws RemoteException;
    List<ProductOverviewDTO> searchPhonogramsByTitleOrInterpret(String searchString) throws RemoteException;
}