package at.fhv.jazzers.shared.api;

import javax.ejb.Remote;

@Remote
public interface RemoteSession {
    boolean authenticate(String username, String password);
    String username();
    RMI_CustomerService rmi_customerService();
    RemoteMessageConsumerService messageConsumerService();
    RemoteMessagePublisherService messagePublisherService();
    RemoteProductService productService();
    RemoteSaleService saleService();
}
