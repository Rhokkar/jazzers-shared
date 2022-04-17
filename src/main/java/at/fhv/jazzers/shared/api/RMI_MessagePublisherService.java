package at.fhv.jazzers.shared.api;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMI_MessagePublisherService extends Remote {
    void publish(String topic, String title, String message) throws RemoteException;
}
