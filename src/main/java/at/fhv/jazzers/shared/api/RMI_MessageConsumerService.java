package at.fhv.jazzers.shared.api;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMI_MessageConsumerService extends Remote {
    String consume(String topic) throws RemoteException;
}
