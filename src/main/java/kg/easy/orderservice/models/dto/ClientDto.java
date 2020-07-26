package kg.easy.orderservice.models.dto;

import kg.easy.orderservice.models.num.ClientStatus;
import lombok.Data;

import java.util.List;

@Data
public class ClientDto {
    private Long id;

    private String name;
    private ClientStatus clientStatus;

    private List<ClientAddressDto> clientAddresses;

    private List<PhoneDto> phones;
}
