package com.stockmarket.stockprice.Service;

import com.stockmarket.stockprice.DTO.AddIpoStockExchangeDTO;
import com.stockmarket.stockprice.Helper.ServiceResponse;

public interface StockPriceService {

    ServiceResponse addIpoStockExchange(AddIpoStockExchangeDTO addIpoStockExchangeDTO);
}
