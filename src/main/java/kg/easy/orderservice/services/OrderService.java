package kg.easy.orderservice.services;

import kg.easy.orderservice.models.dto.OrderDto;
import kg.easy.orderservice.models.entity.OrderDetail;

import java.util.List;

public interface OrderService {
    OrderDto createOrder(OrderDto orderDto);
    List<OrderDto> getList();
}
