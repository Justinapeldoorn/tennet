package justin.tennet.application.mappers;

import justin.tennet.application.entities.ProductionInstallationsEntity;
import org.mapstruct.Mapper;
import org.openapitools.model.ProductionInstallationsDto;

@Mapper
public interface ProductionInstallationsMapper {

  ProductionInstallationsEntity mapDtoToEntity(ProductionInstallationsDto dto);

  ProductionInstallationsDto mapEntityToDto(ProductionInstallationsEntity entity);
}
