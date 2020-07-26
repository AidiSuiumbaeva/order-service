package kg.easy.orderservice.mappers;

import kg.easy.orderservice.models.dto.OrderDto;
import kg.easy.orderservice.models.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface OrderMapper {
    OrderMapper ORDER_MAPPER= Mappers.getMapper(OrderMapper.class);

    Order orderDtoToOrder(OrderDto orderDto);
    List<OrderDto> OrdersToOrderDtos(List<Order> orders);

 //OrderDto orderToOrderDto(Order order, List<OrderDetail> orderDetails, OrderHistory orderHistory);
}
