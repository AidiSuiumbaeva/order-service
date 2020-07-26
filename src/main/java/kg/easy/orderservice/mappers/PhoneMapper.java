package kg.easy.orderservice.mappers;

import kg.easy.orderservice.models.dto.PhoneDto;
import kg.easy.orderservice.models.entity.Phone;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PhoneMapper {
    PhoneMapper PHONE_MAPPER= Mappers.getMapper(PhoneMapper.class);

    PhoneDto phoneToPhoneDto(Phone phone);
    List<PhoneDto> phonesToPhoneDtos(List<Phone> phones);
    List<Phone> phoneDtosToPhones(List<PhoneDto> phoneDtos);
    Phone phoneDtoToPhone(PhoneDto phoneDto);
}
