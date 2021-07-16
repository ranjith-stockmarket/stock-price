package com.stockmarket.stockprice.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Getter @Setter
public class AddIpoStockExchangeDTO {
    private Long ipoId;
    private List<Long> stockExchangeIds;
}
