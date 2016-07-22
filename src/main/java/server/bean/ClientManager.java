package server.bean;

import server.ejb.ClientEJB;
import server.entity.ClientE;
import server.service.ClientService;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.io.Serializable;

/**
 * Created by Gamzat on 03.12.2015.
 */
@Stateless
public class ClientManager implements Serializable {

    @Inject
    ClientEJB clientEJB;

    public ClientManager() {
    }

    public void startClient(ClientB clientB) {
        ClientService.startClient(new ClientE(clientB.getCount(),clientB.getPort()));
    }
}
