package com.tyss.ps.repository;

import org.springframework.data.repository.CrudRepository;

import com.tyss.ps.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
