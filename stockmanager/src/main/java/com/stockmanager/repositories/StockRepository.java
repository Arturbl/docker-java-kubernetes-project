package com.stockmanager.repositories;

import org.springframework.data.repository.CrudRepository;
import com.stockmanager.model.Stock;

public interface StockRepository extends CrudRepository<Stock, String> {
}
