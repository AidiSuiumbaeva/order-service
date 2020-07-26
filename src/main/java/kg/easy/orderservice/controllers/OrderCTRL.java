package kg.easy.orderservice.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kg.easy.orderservice.models.dto.OrderDto;
import kg.easy.orderservice.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/order")
@Api(value = "Order Service Management",description = "Методы для управления заказом")
public class OrderCTRL {
    @Autowired
    private OrderService service;


    @ApiOperation(value = "create order")
    @PostMapping("/create")
    public OrderDto createOrder(@RequestBody OrderDto orderDto){

        return service.createOrder(orderDto);
    }

    @ApiOperation(value = "get all order")
    @GetMapping ("/getall")
    public List<OrderDto> getAll(){

        return service.getList();
    }

}
