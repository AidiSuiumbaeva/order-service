package kg.easy.orderservice.models.entity;

import kg.easy.orderservice.models.num.OrderStatus;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "order_histories")
public class OrderHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Date naviDate;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    private Date startDate;
    private Date endDate;

    @Enumerated(value = EnumType.STRING)
    private OrderStatus status;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
