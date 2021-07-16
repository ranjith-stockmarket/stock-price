package com.stockmarket.stockprice.Repository;

import com.stockmarket.stockprice.DAO.StockPrice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockPriceRepository extends JpaRepository<StockPrice, Long> {
}
