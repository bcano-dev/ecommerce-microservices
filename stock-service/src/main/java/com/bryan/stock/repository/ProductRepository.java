package com.bryan.stock.repository;

import org.springframework.data.repository.CrudRepository;
import com.bryan.stock.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
