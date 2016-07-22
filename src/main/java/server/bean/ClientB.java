package  server.bean;

import server.entity.ClientE;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * Created by Gamzat on 03.12.2015.
 */
@ManagedBean
@RequestScoped
public class ClientB {
    Integer id;

    private Integer port;
    private Integer count;
    private String message;

    public ClientB() {
    }

    public ClientB(ClientE clientE){
        this.id = clientE.getId();
        this.count = clientE.getCount();
        this.port = clientE.getPort();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
