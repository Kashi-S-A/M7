package com.tyss.ps.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.tyss.ps.dao.ProductDAO;
import com.tyss.ps.dto.FilterDTO;
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
		
		int a = 10/0;
		
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

	public ResponseEntity<String> deleteById(Integer id) {
		Product dbProd = productDAO.getById(id);
		productDAO.delete(dbProd);
//		productRepository.deleteById(id);
		return ResponseEntity.status(HttpStatus.OK).body("the product with id " + dbProd.getPid() + " is Deleted");
	}

	public ResponseEntity<?> test() {
		int n = 2;
		if (n % 2 == 0) {
			return new ResponseEntity<Integer>(n, HttpStatus.OK);
		} else {
			return new ResponseEntity<String>("Odd", HttpStatus.OK);
		}
	}

	public List<Product> findAll() {
		return productRepository.findAll();
	}

	public Page<Product> fetchByPage(Integer pageNumber) {
		// logic to fetch records based on pageNumber

		Pageable pageable = PageRequest.of(pageNumber - 1, 10);

		Page<Product> all = productRepository.findAll(pageable);

//		List<Product> products = all.toList();

		return all;
	}

	// Sorting order -> asc,desc
	public List<Product> sortProducts(String param, String order) {
		if (order != null && order.equalsIgnoreCase("desc")) {
			return productRepository.findAll(Sort.by(param).descending());// sort in ascending order by default
		}
		return productRepository.findAll(Sort.by(param).ascending());
	}

	// Filter products
	public List<Product> filter(FilterDTO filterDTO) {

		Product product = new Product();

		BeanUtils.copyProperties(filterDTO, product);

		Example<Product> example = Example.of(product);

		List<Product> products = productRepository.findAll(example);

		return products;
	}

	public List<Product> priceRange(Double fPrice, Double tPrice) {
		return productRepository.getProductsPriceRange(fPrice, tPrice);
	}

	public List<Product> searchByName(String name) {
		return productRepository.findByNameContainingIgnoreCase(name);
	}
}
