package at.fhv.jazzers.shared.api;

import javax.ejb.Remote;

@Remote
public interface RemoteSession {
    String username();
    RMI_CustomerService rmi_customerService();
    RemoteMessageConsumerService remoteMessageConsumerService();
    RemoteMessagePublisherService remoteMessagePublisherService();
    RemoteProductService remoteProductService();
    RemoteSaleService remoteSaleService();
}
