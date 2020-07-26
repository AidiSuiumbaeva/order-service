package kg.easy.orderservice.services.impl;

import kg.easy.orderservice.dao.ClientRep;
import kg.easy.orderservice.mappers.ClientMapper;
import kg.easy.orderservice.mappers.PhoneMapper;
import kg.easy.orderservice.models.dto.ClientDto;
import kg.easy.orderservice.models.dto.PhoneDto;
import kg.easy.orderservice.models.entity.Client;
import kg.easy.orderservice.models.entity.Phone;
import kg.easy.orderservice.services.ClientService;
import kg.easy.orderservice.services.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    private PhoneService service;
    @Autowired
    private ClientRep clientRep;
    @Override
    public ClientDto create(ClientDto clientDto) {
        Client client= ClientMapper.CLIENT_MAPPER.clientDtoToClient(clientDto);
        client=clientRep.save(client);

        List<PhoneDto> phoneDtos=clientDto.getPhones().stream()
                .filter(x->!service.existByMsisdn(x.getMsisdn()))
                .collect(Collectors.toList());

        Client finalClient = client;
        List<Phone> phones= phoneDtos.stream().
                map(x->{
                    Phone phone=PhoneMapper.PHONE_MAPPER.phoneDtoToPhone(x);
                    phone.setClient(finalClient);
                    return phone;
                }
        ).collect(Collectors.toList());


        phoneDtos=service.setPhonesToClient(phones);
        clientDto.setPhones(phoneDtos);

        return clientDto;
    }
}
