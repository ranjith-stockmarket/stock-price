package com.stockmarket.stockprice.DAO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter @Setter
@Table(name = "ipo_stock_exchange")
public class IpoStockExchange {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "ipo_id")
    private Long ipoId;

    @Column(name = "stock_exchange_id")
    private Long stockExchangeId;
}
