package com.tyss.ps.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tyss.ps.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	// Custom queries ==> JPQL/HQL
	// @Query("SELECT p FROM Product p WHERE p.price>=?1 AND p.price<=?2") // Index
	// based parameter
//	@Query(value = "SELECT * from products", nativeQuery = true)//SQL query
	@Query("SELECT p FROM Product p WHERE p.price>=:fromPrice AND p.price<=:toPrice") // naming based parameter
	public List<Product> getProductsPriceRange(Double fromPrice, Double toPrice);

	@Query("SELECT p FROM Product p WHERE p.name=:prodName AND p.price=:prodPrice")
	public List<Product> getByNameAndPrice(String prodName, Double prodPrice);

	// custom methods ==> No need of JPQL/HQL, but we need to follow method naming
	// convention -->
	// method Name should start from findBy (to add condition we have to use the
	// states of entity object with convention again)
	public List<Product> findByNameAndPrice(String name, Double price);

	public List<Product> findByNameContainingIgnoreCase(String name);

	public List<Product> findByPriceBetween(Double fromPrice, Double toPrice);

	public List<Product> findByPriceIsLessThanEqual(Double price);

}
