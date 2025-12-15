package com.tyss.ps.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.ps.model.Product;
import com.tyss.ps.repository.ProductRepository;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/pd")
public class ProductController {

	@Autowired
	private ProductRepository productRepository;

	// saving product
	@PostMapping("/save")
	public Product saveProduct(@RequestBody Product product) {
		Product saved = productRepository.save(product);// saves the object and returns the saved object
		return saved;
	}

	// fetch all products
	@GetMapping
	public Iterable<Product> fetchAll() {
		Iterable<Product> all = productRepository.findAll();
		return all;
	}

	// fetch By Id
	@GetMapping("/byId")
	public Product fetchById(@RequestParam Integer pid) {
//		Optional<Product> opt = productRepository.findById(pid);
//
////		if (opt.isPresent()) {
////			Product product = opt.get();
////			return product;
////		} else {
////			System.out.println("not found");
////			return null;
////		}
//
//		Product product = opt.orElseThrow(() -> new RuntimeException("Product not found"));
//
//		return product;

		return productRepository.findById(pid).orElseThrow(() -> new RuntimeException("Product not found"));
	}

}
