package kg.easy.orderservice.services;

import kg.easy.orderservice.models.dto.ClientDto;

public interface ClientService {
    ClientDto create(ClientDto clientDto);
}
