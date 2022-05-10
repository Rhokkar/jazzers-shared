package at.fhv.jazzers.shared.api;

import javax.ejb.Remote;

@Remote
public interface RMI_MessagePublisherService {
    void publish(String topic, String title, String message);
}
