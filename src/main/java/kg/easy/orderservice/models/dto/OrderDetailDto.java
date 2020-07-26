package kg.easy.orderservice.models.dto;

import kg.easy.orderservice.models.entity.Client;
import kg.easy.orderservice.models.entity.Order;
import kg.easy.orderservice.models.entity.OrderDetail;
import lombok.Data;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Data
public class OrderDetailDto {

    private Long id;
    private ClientDto recipient;

    private ClientDto sender;

    private Date estDate;
}
