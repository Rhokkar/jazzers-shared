package at.fhv.jazzers.shared.api;

import at.fhv.jazzers.shared.dto.ProductOverviewDTO;

import javax.ejb.Remote;
import java.util.List;

@Remote
public interface RMI_ProductService {
    List<ProductOverviewDTO> searchAnalog(String titleOrInterpret);
    List<ProductOverviewDTO> searchDigital(String titleOrInterpret);
}