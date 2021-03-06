package at.fhv.jazzers.shared.api;

import at.fhv.jazzers.shared.dto.LineDTO;
import at.fhv.jazzers.shared.dto.SaleHistoryEntryDetailDTO;
import at.fhv.jazzers.shared.dto.SaleHistoryEntryOverviewDTO;

import javax.ejb.Remote;
import java.util.List;
import java.util.UUID;

@Remote
public interface RemoteSaleService {
    void purchase(UUID customerId, List<LineDTO> linesDTO);
    void refund(UUID saleId, List<LineDTO> linesDTO);
    List<SaleHistoryEntryOverviewDTO> saleHistoryFull();
    List<SaleHistoryEntryOverviewDTO> saleHistoryBy(String customerNameOrSaleId);
    SaleHistoryEntryDetailDTO saleDetail(UUID saleId);
}