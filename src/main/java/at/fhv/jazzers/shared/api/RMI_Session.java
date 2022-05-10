package at.fhv.jazzers.shared.api;

import javax.ejb.Remote;

@Remote
public interface RMI_Session {
    String username();
    RMI_CustomerService rmi_customerService();
    RMI_MessageConsumerService rmi_messageConsumerService();
    RMI_MessagePublisherService rmi_messagePublisherService();
    RMI_ProductService rmi_productService();
    RMI_SaleService rmi_saleService();
}
