package kg.easy.orderservice.models.dto;

import lombok.Data;

@Data
public class ClientAddressDto {
    private Long id;

    private boolean isMain;
    private boolean active;

    private AddressDto address;

}
