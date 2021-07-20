package com.stockmarket.stockprice.Service;

import com.stockmarket.stockprice.DTO.StockExchangeDTO;
import com.stockmarket.stockprice.DTO.StockExchangeIdsDTO;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ClientService {

    private final RestTemplate restTemplate;
    private final String COMPANY_SERVICE = "http://company-service/api/company";
    private final String STOCK_EXCHANGE_SERVICE = "http://stock-exchange-service/api/stock-exchange";

    public ClientService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public StockExchangeDTO getStockExchangeById(Long stockExchangeId){
        return restTemplate
                .getForObject(STOCK_EXCHANGE_SERVICE+"/get/"+stockExchangeId, StockExchangeDTO.class);
    }

    boolean doStockExchangeIdsExist(StockExchangeIdsDTO stockExchangeIds){
        HttpEntity<StockExchangeIdsDTO> request = new HttpEntity<>(stockExchangeIds);
        Boolean result = restTemplate
                .postForObject(STOCK_EXCHANGE_SERVICE+"/doExist/multiple", request, Boolean.class);
        return result!=null && result;
    }
}
