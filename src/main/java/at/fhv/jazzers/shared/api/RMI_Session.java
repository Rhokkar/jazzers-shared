package at.fhv.jazzers.shared.api;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMI_Session extends Remote {
    RMI_CustomerService rmi_customerService() throws RemoteException;
    RMI_ProductService rmi_productService() throws RemoteException;
    RMI_SaleService rmi_saleService() throws RemoteException;
}
