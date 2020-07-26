package kg.easy.orderservice.models.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "clientAddresses")
public class ClientAddress {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    private boolean isMain;
    private boolean active;
    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;

}
