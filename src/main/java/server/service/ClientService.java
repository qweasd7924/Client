package server.service;

import server.entity.ClientE;

import javax.ejb.Stateless;

@Stateless
public class ClientService extends Service{

    public static ClientE startClient(ClientE clientE){

        em.getTransaction().begin();
        ClientE result = em.merge(clientE);
        em.getTransaction().commit();
        return result;
    }
}
