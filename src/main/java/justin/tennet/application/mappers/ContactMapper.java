package justin.tennet.application.mappers;

import justin.tennet.application.entities.ContactEntity;
import org.mapstruct.Mapper;
import org.openapitools.model.ContactDto;

@Mapper
public interface ContactMapper {

  ContactEntity mapDtoToEntity(ContactDto dto);

  ContactDto mapEntityToDto(ContactEntity entity);
}
