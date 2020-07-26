package kg.easy.orderservice.models.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "black_list")
public class BlacckList {
    @Id
    @GeneratedValue
    private Long id;

    private Date addDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

}
