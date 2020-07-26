package kg.easy.orderservice.services.impl;

import kg.easy.orderservice.dao.OrderRep;
import kg.easy.orderservice.mappers.OrderMapper;
import kg.easy.orderservice.models.dto.OrderDetailDto;
import kg.easy.orderservice.models.dto.OrderDto;
import kg.easy.orderservice.models.entity.Order;
import kg.easy.orderservice.services.OrderDetailService;
import kg.easy.orderservice.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDetailService service;

    @Autowired
    private OrderRep orderRep;

    @Override
    public OrderDto createOrder(OrderDto orderDto) {
        Order order= OrderMapper.ORDER_MAPPER.orderDtoToOrder(orderDto);
        order=orderRep.save(order);
        orderDto.setId(order.getId());

        List<OrderDetailDto> orderDetailDtos=service.setDetailToOrder(orderDto);
        orderDto.setOrderDetails(orderDetailDtos);
        return orderDto;
    }

    @Override
    public List<OrderDto> getList() {
    return OrderMapper.ORDER_MAPPER.OrdersToOrderDtos(orderRep.findAll());

    }
}
