package com.stockmarket.stockprice.Service;

import com.stockmarket.stockprice.DAO.IpoStockExchange;
import com.stockmarket.stockprice.DTO.AddIpoStockExchangeDTO;
import com.stockmarket.stockprice.DTO.StockExchangeIdsDTO;
import com.stockmarket.stockprice.Helper.ServiceResponse;
import com.stockmarket.stockprice.Repository.IpoStockExchangeRepository;
import com.stockmarket.stockprice.Repository.StockPriceRepository;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StockPriceService{

    private final StockPriceRepository stockPriceRepository;
    private final IpoStockExchangeRepository ipoStockExchangeRepository;
    private final ModelMapper modelMapper;
    private final ClientService clientService;

    public StockPriceService(StockPriceRepository stockPriceRepository, IpoStockExchangeRepository ipoStockExchangeRepository, ModelMapper modelMapper, ClientService clientService) {
        this.stockPriceRepository = stockPriceRepository;
        this.ipoStockExchangeRepository = ipoStockExchangeRepository;
        this.modelMapper = modelMapper;
        this.clientService = clientService;
    }

    public ServiceResponse addIpoStockExchange(AddIpoStockExchangeDTO addIpoStockExchangeDTO) {
        Long ipoId = addIpoStockExchangeDTO.getIpoId();
        List<Long> stockExchangeIds = addIpoStockExchangeDTO.getStockExchangeIds();
        if(clientService.doStockExchangeIdsExist(
                        new StockExchangeIdsDTO(stockExchangeIds))){
            List<IpoStockExchange> ipoStockExchanges = new ArrayList<>();
            for(Long id:stockExchangeIds){
                IpoStockExchange ipoStockExchange = new IpoStockExchange();
                ipoStockExchange.setIpoId(ipoId);
                ipoStockExchange.setStockExchangeId(id);
                ipoStockExchanges.add(ipoStockExchange);
            }
            ipoStockExchangeRepository.saveAll(ipoStockExchanges);
            return new ServiceResponse(HttpStatus.OK, Boolean.TRUE);
        }
        return new ServiceResponse(HttpStatus.OK, Boolean.FALSE);
    }
}
