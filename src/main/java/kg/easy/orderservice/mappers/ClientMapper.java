package kg.easy.orderservice.mappers;

import kg.easy.orderservice.models.dto.ClientDto;
import kg.easy.orderservice.models.entity.Client;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ClientMapper {
    ClientMapper CLIENT_MAPPER= Mappers.getMapper(ClientMapper.class);

    Client clientDtoToClient(ClientDto clientDto);
    ClientDto clientToClientDto(Client client);
}
