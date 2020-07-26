package kg.easy.orderservice.services.impl;

import kg.easy.orderservice.dao.OrderDetailRep;
import kg.easy.orderservice.mappers.OrderDetailMapper;
import kg.easy.orderservice.mappers.OrderMapper;
import kg.easy.orderservice.models.dto.OrderDetailDto;
import kg.easy.orderservice.models.dto.OrderDto;
import kg.easy.orderservice.models.entity.OrderDetail;
import kg.easy.orderservice.services.ClientService;
import kg.easy.orderservice.services.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDetailServiceImpl implements OrderDetailService {

    @Autowired
    private ClientService service;

    @Autowired
    private OrderDetailRep orderDetailRep;

    @Override
    public List<OrderDetailDto> setDetailToOrder(OrderDto orderDto) {

        List<OrderDetailDto> orderDetailDtos=orderDto.getOrderDetails();

        orderDetailDtos.stream().forEach(x->
        {x.setRecipient(service.create(x.getRecipient()));
        x.setSender(service.create(x.getSender()));
        });

        List<OrderDetail> orderDetails=OrderDetailMapper.ORDER_DETAIL_MAPPER.orderDetailDtosToOrderDetails(orderDetailDtos);
        orderDetails.stream()
                .forEach(x->x.setOrder(OrderMapper.ORDER_MAPPER.orderDtoToOrder(orderDto)));
        orderDetails=orderDetailRep.saveAll(orderDetails);

        orderDetailDtos=OrderDetailMapper.ORDER_DETAIL_MAPPER.orderDetailToOrderDetailsDtos(orderDetails);


        return orderDetailDtos;
    }
}
