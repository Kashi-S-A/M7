package com.tyss.ps.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.ps.dao.ProductDAO;
import com.tyss.ps.model.Product;
import com.tyss.ps.repository.ProductRepository;

//Business logic of an application
@Service
public class ProductService {

	@Autowired
	private ProductDAO productDAO;

	@Autowired
	private ProductRepository productRepository;

	public Product save(Product product) {
		return productDAO.save(product);
	}

	public Product getById(Integer pid) {
		return productDAO.getById(pid);
	}

	public Product updateProduct(Integer id, Product product) {
		// present or not ?

//		Optional<Product> opt = productRepository.findById(id);
//		// if present update new data
//		// else return error msg
//
//		if (opt.isPresent()) {
//			Product dbProduct = opt.get();
//
//			if (product.getName() != null)
//				dbProduct.setName(product.getName());
//			if (product.getPrice() > 0)
//				dbProduct.setPrice(product.getPrice());
//			if (product.getDescription() != null)
//				dbProduct.setDescription(product.getDescription());
//			if (product.getColor() != null)
//				dbProduct.setColor(product.getColor());
//
//			return productRepository.save(dbProduct);
//
//		}
//		return null;

		Product dbProd = productDAO.getById(id);

		if (product.getName() != null)
			dbProd.setName(product.getName());
		if (product.getPrice() != null)
			dbProd.setPrice(product.getPrice());
		if (product.getDescription() != null)
			dbProd.setDescription(product.getDescription());
		if (product.getColor() != null)
			dbProd.setColor(product.getColor());

		return productDAO.save(dbProd);
	}

	public String deleteById(Integer id) {
		Product dbProd = productDAO.getById(id);
		productDAO.delete(dbProd);
//		productRepository.deleteById(id);
		return "Deleted";
	}

	public List<Product> findAll() {
		return productRepository.findAll();
	}
}
