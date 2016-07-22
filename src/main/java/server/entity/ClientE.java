package server.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "client")

public class ClientE implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "client_id")
    Integer id;

    @Column
    Integer count;
    @Column
    Integer port;

    public ClientE() {
    }

    public ClientE(Integer count, Integer port) {
        this.count = count;
        this.port = port;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
}
