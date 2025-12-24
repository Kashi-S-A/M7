package com.tyss.ps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.ps.model.Product;
import com.tyss.ps.repository.ProductRepository;

//API's
@RestController
@RequestMapping("/pd")
public class ProductController {

	@Autowired
	private ProductRepository productRepository;

	// saving product
	@PostMapping("/save")
	public ResponseEntity<Product> saveProduct(@RequestBody Product product) {
		return ResponseEntity.status(HttpStatus.CREATED).body(productRepository.save(product));
	}

	// fetch all products
	@GetMapping
	public ResponseEntity<List<Product>> fetchAll() {
		return ResponseEntity.status(HttpStatus.OK).body(productRepository.findAll());
	}

	// fetch By Id
	@GetMapping("/byId")
	public ResponseEntity<Product> fetchById(@RequestParam Integer pid) {
		return ResponseEntity.status(HttpStatus.OK)
				.body(productRepository.findById(pid).orElseThrow(() -> new RuntimeException("Product Not found")));
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteProduct(@PathVariable Integer id) {
		productRepository.deleteById(id);
		return ResponseEntity.status(HttpStatus.OK).body("Deleted Successfully");
	}

}