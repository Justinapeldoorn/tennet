package justin.tennet.application.repositories;

import java.util.List;
import justin.tennet.application.entities.ProductionInstallationsEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface ProductionInstallationsRepository
    extends MongoRepository<ProductionInstallationsEntity, String> {

  @Query("{outputPower:{$gte:?0,$lte:?1}}")
  List<ProductionInstallationsEntity> findByOutputPowerInclusive(
      double minInclusive, double maxInclusive);
}
