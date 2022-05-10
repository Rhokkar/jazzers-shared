package at.fhv.jazzers.shared.api;

import javax.ejb.Remote;

@Remote
public interface RemoteSession {
    String username();
    RemoteCustomerService rmi_customerService();
    RemoteMessageConsumerService rmi_messageConsumerService();
    RemoteMessagePublisherService rmi_messagePublisherService();
    RemoteProductService rmi_productService();
    RemoteSaleService rmi_saleService();
}
