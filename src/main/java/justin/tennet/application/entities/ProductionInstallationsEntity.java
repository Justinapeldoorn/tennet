package justin.tennet.application.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("ProductionInstallations")
public class ProductionInstallationsEntity {

  @Id private final String name;
  @DBRef private final ContactEntity contact;

  private final Double outputPower;

  public ProductionInstallationsEntity(String name, ContactEntity contact, Double outputPower) {
    this.name = name;
    this.contact = contact;
    this.outputPower = outputPower;
  }

  public String getName() {
    return name;
  }

  public Double getOutputPower() {
    return outputPower;
  }

  public ContactEntity getContact() {
    return contact;
  }
}
