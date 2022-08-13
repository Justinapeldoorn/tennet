package justin.tennet.application.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Contact")
public class ContactEntity {

  @Id private final String name;
  private final String zipCode;
  private final String city;
  private final String houseNumber;

  public ContactEntity(String name, String zipCode, String city, String houseNumber) {
    this.name = name;
    this.zipCode = zipCode;
    this.city = city;
    this.houseNumber = houseNumber;
  }

  public String getName() {
    return name;
  }

  public String getZipCode() {
    return zipCode;
  }

  public String getCity() {
    return city;
  }

  public String getHouseNumber() {
    return houseNumber;
  }
}
