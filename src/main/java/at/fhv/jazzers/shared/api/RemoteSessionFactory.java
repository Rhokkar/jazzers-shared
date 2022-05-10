package at.fhv.jazzers.shared.api;

import javax.ejb.Remote;

@Remote
public interface RemoteSessionFactory {
    RemoteSession authenticate(String username, String password);
}
