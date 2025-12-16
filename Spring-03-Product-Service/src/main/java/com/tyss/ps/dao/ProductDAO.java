package com.tyss.ps.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tyss.ps.model.Product;
import com.tyss.ps.repository.ProductRepository;

//Persistence Logic
@Repository
public class ProductDAO {

	@Autowired
	private ProductRepository productRepository;

	public Product save(Product product) {
		return productRepository.save(product);
	}

	public Product getById(Integer id) {

//		Optional<Product> opt = productRepository.findById(pid);

////				if (opt.isPresent()) {
////					Product product = opt.get();
////					return product;
////				} else {
////					System.out.println("not found");
////					return null;
////				}
		//
//				Product product = opt.orElseThrow(() -> new RuntimeException("Product not found"));
		//
//				return product;

		return productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product Not Found"));
	}

	public void delete(Product dbProd) {
		productRepository.delete(dbProd);
	}
}
