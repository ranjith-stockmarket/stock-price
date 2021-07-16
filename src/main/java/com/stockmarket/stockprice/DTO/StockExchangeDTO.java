package com.stockmarket.stockprice.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class StockExchangeDTO {
    private Long id;
    private String name;
    private String brief;
    private String address;
    private String remarks;
}
