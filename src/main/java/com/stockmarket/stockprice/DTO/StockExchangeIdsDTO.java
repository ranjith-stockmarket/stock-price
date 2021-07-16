package com.stockmarket.stockprice.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class StockExchangeIdsDTO {
    private List<Long> stockExchangeIds;
}
