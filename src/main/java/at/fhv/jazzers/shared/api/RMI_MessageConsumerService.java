package at.fhv.jazzers.shared.api;

import at.fhv.jazzers.shared.dto.MessageDTO;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface RMI_MessageConsumerService extends Remote {
    List<MessageDTO> getMessagesFromSubscribedTopics(String userName) throws RemoteException;
}
