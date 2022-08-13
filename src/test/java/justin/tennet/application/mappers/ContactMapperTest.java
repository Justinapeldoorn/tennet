package justin.tennet.application.mappers;

import static org.assertj.core.api.Assertions.assertThat;

import justin.tennet.application.entities.ContactEntity;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.openapitools.model.ContactDto;

@ExtendWith(MockitoExtension.class)
class ContactMapperTest {

  ContactMapper mapper = new ContactMapperImpl();

  @Test
  void voorbeeldUnitTest() {
    final ContactDto contactDto = new ContactDto();
    contactDto.setCity("apeldoorn");
    contactDto.setName("name");
    contactDto.setHouseNumber("20");
    contactDto.setZipCode("7311 TL");

    ContactEntity entity = mapper.mapDtoToEntity(contactDto);

    assertThat(entity).usingRecursiveComparison().isEqualTo(contactDto);
  }
}
