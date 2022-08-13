package justin.tennet.application.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import justin.tennet.application.entities.ContactEntity;
import justin.tennet.application.mappers.ContactMapper;
import justin.tennet.application.repositories.ContactRepository;
import org.openapitools.model.ContactDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ContactService {

  @Autowired ContactMapper contactMapper;

  @Autowired ContactRepository contactRepository;

  public ContactDto saveContact(ContactDto dto) {
    final ContactEntity entity = contactMapper.mapDtoToEntity(dto);

    return contactMapper.mapEntityToDto(contactRepository.save(entity));
  }

  public ContactDto findByName(String name) {
    final Optional<ContactEntity> optionalContact = contactRepository.findById(name);

    return optionalContact.map(entity -> contactMapper.mapEntityToDto(entity)).orElse(null);
  }

  public List<ContactDto> findAll() {
    return contactRepository.findAll().stream()
        .map(entity -> contactMapper.mapEntityToDto(entity))
        .collect(Collectors.toList());
  }
}
