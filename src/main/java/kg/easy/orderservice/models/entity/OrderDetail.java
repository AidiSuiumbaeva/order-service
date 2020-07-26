package kg.easy.orderservice.models.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data@Entity
@Table(name = "order_detail")
public class OrderDetail {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    @JoinColumn(name = "recipient_id")
    private Client recipient;

    @ManyToOne
    @JoinColumn(name = "sender_id")
    private Client sender;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    private Date estDate;

}
