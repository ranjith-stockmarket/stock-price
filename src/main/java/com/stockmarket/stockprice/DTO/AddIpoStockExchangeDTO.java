package com.stockmarket.stockprice.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@NoArgsConstructor
@Getter @Setter
public class AddIpoStockExchangeDTO {
    private Long ipoId;
    private List<Long> stockExchangeIds;
}
