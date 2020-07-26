package kg.easy.orderservice.services;

import kg.easy.orderservice.models.dto.PhoneDto;
import kg.easy.orderservice.models.entity.Phone;

import java.util.List;

public interface PhoneService {
    List<PhoneDto>  setPhonesToClient(List<Phone> phones);

    boolean existByMsisdn(String msisdn);
}
