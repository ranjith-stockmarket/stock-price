package com.stockmarket.stockprice.Repository;

import com.stockmarket.stockprice.DAO.IpoStockExchange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IpoStockExchangeRepository extends JpaRepository<IpoStockExchange, Long> {
}
