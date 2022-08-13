package justin.tennet.application.repositories;

import justin.tennet.application.entities.ContactEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContactRepository extends MongoRepository<ContactEntity, String> {}
