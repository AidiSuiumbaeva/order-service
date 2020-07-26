package kg.easy.orderservice.mappers;

import kg.easy.orderservice.models.dto.OrderDetailDto;
import kg.easy.orderservice.models.entity.OrderDetail;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface OrderDetailMapper {
    OrderDetailMapper ORDER_DETAIL_MAPPER= Mappers.getMapper(OrderDetailMapper.class);

    OrderDetail orderDetailDtoToOrderDetail(OrderDetailDto  orderDetailDto);
    OrderDetailDto orderDetailToOrderDetailDto(OrderDetail  orderDetail);
    List<OrderDetail> orderDetailDtosToOrderDetails(List<OrderDetailDto> orderDetailtos);
    List<OrderDetailDto> orderDetailToOrderDetailsDtos(List<OrderDetail> orderDetails);
}
