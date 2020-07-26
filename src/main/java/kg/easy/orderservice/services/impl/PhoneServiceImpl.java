package kg.easy.orderservice.services.impl;

import kg.easy.orderservice.dao.PhoneRepository;
import kg.easy.orderservice.mappers.PhoneMapper;
import kg.easy.orderservice.models.dto.PhoneDto;
import kg.easy.orderservice.models.entity.Phone;
import kg.easy.orderservice.services.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneServiceImpl implements PhoneService {


    @Autowired
    private PhoneRepository phoneRepository;

    @Override
    public List<PhoneDto> setPhonesToClient(List<Phone> phones) {
        phones=phoneRepository.saveAll(phones);

        return PhoneMapper.PHONE_MAPPER.phonesToPhoneDtos(phones);
    }

    @Override
    public boolean existByMsisdn(String msisdn) {
        return phoneRepository.existsPhoneByMsisdn(msisdn);
    }
}
