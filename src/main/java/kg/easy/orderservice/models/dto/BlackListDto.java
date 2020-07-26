package kg.easy.orderservice.models.dto;

import lombok.Data;

import java.util.Date;

@Data
public class BlackListDto {
    private Long id;

    private Date addDate;

    private UserDto user;

    private ClientDto client;

}
