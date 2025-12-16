package com.tyss.ps.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tyss.ps.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
