package at.fhv.jazzers.shared.api;

import at.fhv.jazzers.shared.dto.MessageDTO;

import javax.ejb.Remote;
import java.util.List;

@Remote
public interface RMI_MessageConsumerService {
    List<MessageDTO> getMessagesFromSubscribedTopics(String userName);
}
