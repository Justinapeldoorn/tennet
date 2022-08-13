package justin.tennet.application.controllers;

import justin.tennet.application.services.ContactService;
import org.openapitools.api.ContactApi;
import org.openapitools.model.ContactDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ContactController implements ContactApi {

  @Autowired ContactService contactService;

  @Override
  public ResponseEntity<ContactDto> saveContact(ContactDto contactDto) {
    final ContactDto savedDto = contactService.saveContact(contactDto);
    return new ResponseEntity<>(savedDto, HttpStatus.OK);
  }

  @Override
  public ResponseEntity<ContactDto> findContactByName(String name) {
    final ContactDto foundContact = contactService.findByName(name);
    return new ResponseEntity<>(foundContact, HttpStatus.OK);
  }

  @Override
  public ResponseEntity<List<ContactDto>> findAllContacts() {
    final List<ContactDto> allContacts = contactService.findAll();
    return new ResponseEntity<>(allContacts, HttpStatus.OK);
  }
}
