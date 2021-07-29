package com.stockmarket.stockprice.Controller;

import com.stockmarket.stockprice.DTO.AddIpoStockExchangeDTO;
import com.stockmarket.stockprice.Service.StockPriceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/stock-price")
public class StockPriceController {

    private final StockPriceService stockPriceService;

    public StockPriceController(StockPriceService stockPriceService) {
        this.stockPriceService = stockPriceService;
    }

    @PostMapping("/ipo-stock-exchange/add")
    public ResponseEntity<?> addIpoStockExchange(@RequestBody AddIpoStockExchangeDTO addIpoStockExchangeDTO){
        return stockPriceService.addIpoStockExchange(addIpoStockExchangeDTO).getResponse();
    }

}
