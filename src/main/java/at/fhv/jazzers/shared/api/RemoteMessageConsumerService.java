package at.fhv.jazzers.shared.api;

import at.fhv.jazzers.shared.dto.MessageDTO;

import javax.ejb.Remote;
import java.util.List;

@Remote
public interface RemoteMessageConsumerService {
    List<MessageDTO> getMessagesFromSubscribedTopics(String userName);
}
