package kg.easy.orderservice.models.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "addreses")
public class Address {
    @Id
    @GeneratedValue
    private Long id;

    private String street;
    private String house;
    private String flat;
    private String floor;
    private String intercom;
    private String description;
}
