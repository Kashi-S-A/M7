package com.tyss.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.tyss.model.Product;

//api's exposed(business logic to perform crud operations)
@RepositoryRestResource(path = "products")
public interface ProductRepository extends JpaRepository<Product, Integer> {

}