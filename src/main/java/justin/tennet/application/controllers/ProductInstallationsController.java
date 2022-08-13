package justin.tennet.application.controllers;

import java.util.List;
import justin.tennet.application.services.ProductionInstallationsService;
import org.openapitools.api.ProductionInstallationsApi;
import org.openapitools.model.ProductionInstallationsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class ProductInstallationsController implements ProductionInstallationsApi {

  @Autowired private ProductionInstallationsService service;

  @Override
  public ResponseEntity<ProductionInstallationsDto> saveProductionInstallation(
      ProductionInstallationsDto dto) {
    final ProductionInstallationsDto savedDto = service.savePi(dto);
    return new ResponseEntity<>(savedDto, HttpStatus.OK);
  }

  @Override
  public ResponseEntity<ProductionInstallationsDto> findPiByName(String piName) {
    return new ResponseEntity<>(service.findByName(piName), HttpStatus.OK);
  }

  @Override
  public ResponseEntity<List<ProductionInstallationsDto>> findAllPi() {
    return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
  }

  @Override
  public ResponseEntity<List<ProductionInstallationsDto>> findByOutputPowerRange(
      Double minimumInclusive, Double maximumInclusive) {
    return new ResponseEntity<>(
        service.findByOutputPowerInclusive(minimumInclusive, maximumInclusive), HttpStatus.OK);
  }
}
