package justin.tennet.application.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import justin.tennet.application.entities.ProductionInstallationsEntity;
import justin.tennet.application.mappers.ProductionInstallationsMapper;
import justin.tennet.application.repositories.ContactRepository;
import justin.tennet.application.repositories.ProductionInstallationsRepository;
import org.openapitools.model.ProductionInstallationsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductionInstallationsService {

  @Autowired ProductionInstallationsMapper PIMapper;

  @Autowired ProductionInstallationsRepository piRepository;

  @Autowired ContactRepository contactRepository;

  public ProductionInstallationsDto savePi(ProductionInstallationsDto dto) {
    final ProductionInstallationsEntity entity = PIMapper.mapDtoToEntity(dto);

    contactRepository.save(entity.getContact());
    final ProductionInstallationsEntity savedEntity = piRepository.save(entity);

    return PIMapper.mapEntityToDto(savedEntity);
  }

  public ProductionInstallationsDto findByName(String name) {
    final Optional<ProductionInstallationsEntity> optionalPI = piRepository.findById(name);

    return optionalPI.map(entity -> PIMapper.mapEntityToDto(entity)).orElse(null);
  }

  public List<ProductionInstallationsDto> findAll() {
    return piRepository.findAll().stream()
        .map(entity -> PIMapper.mapEntityToDto(entity))
        .collect(Collectors.toList());
  }

  public List<ProductionInstallationsDto> findByOutputPowerInclusive(
      double minInclusive, double maxInclusive) {
    return piRepository.findByOutputPowerInclusive(minInclusive, maxInclusive).stream()
        .map(entity -> PIMapper.mapEntityToDto(entity))
        .collect(Collectors.toList());
  }
}
