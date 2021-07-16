package com.stockmarket.stockprice.Service;

import com.stockmarket.stockprice.DTO.StockExchangeDTO;
import com.stockmarket.stockprice.DTO.StockExchangeIdsDTO;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Headers("Content-Type: application/json")
@FeignClient(name = "stock-exchange", url = "http://localhost:8083/api/stock-exchange")
public interface StockExchangeClientService {

    @GetMapping("/get/{id}")
    StockExchangeDTO getStockExchangeById(@PathVariable("id") Long id);

    @PostMapping("/doExist/multiple")
    Boolean doStockExchangeIdsExist(@RequestBody StockExchangeIdsDTO stockExchangeIdsDTO);
}
