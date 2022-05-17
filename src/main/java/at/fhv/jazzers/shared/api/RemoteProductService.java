package at.fhv.jazzers.shared.api;

import at.fhv.jazzers.shared.dto.DigitalProductDTO;
import at.fhv.jazzers.shared.dto.ProductOverviewDTO;

import javax.ejb.Remote;
import java.util.List;

@Remote
public interface RemoteProductService {
    List<ProductOverviewDTO> searchAnalog(String titleOrInterpret);
    List<DigitalProductDTO> searchDigital(String titleOrInterpret);
}