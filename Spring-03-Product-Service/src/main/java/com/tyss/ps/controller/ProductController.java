package com.tyss.ps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.ps.dto.FilterDTO;
import com.tyss.ps.model.Product;
import com.tyss.ps.service.ProductService;

//API's
@RestController
@RequestMapping("/pd")
public class ProductController {

	@Autowired
	private ProductService productService;

	// saving product
	@PostMapping("/save")
	public Product saveProduct(@RequestBody Product product) {
		Product saved = productService.save(product);// saves the object and returns the saved object
		return saved;
	}

	// fetch all products
	@GetMapping
	public List<Product> fetchAll() {
		List<Product> products = productService.findAll();
		return products;
	}

	// fetch By Id
	@GetMapping("/byId")
	public Product fetchById(@RequestParam Integer pid) {
		return productService.getById(pid);
	}

	@PutMapping("/update/{id}")
	public Product updateProduct(@PathVariable Integer id, @RequestBody Product product) {
		return productService.updateProduct(id, product);
	}

	// Delete a product
	@DeleteMapping("/delete/{id}")
	public String deleteProduct(@PathVariable Integer id) {
		return productService.deleteById(id);
	}

	// Pagination
	@GetMapping("/page")
	public Page<Product> fetchByPage(@RequestParam Integer pageNumber) {
		Page<Product> products = productService.fetchByPage(pageNumber);
		return products;
	}

	// Sorting
	@GetMapping("/sort")
	public List<Product> sortRecords(@RequestParam(required = false, defaultValue = "price") String param,
			@RequestParam(required = false) String order) {
		return productService.sortProducts(param, order);
	}

	// Filtering the records
	@GetMapping("/filter")
	public List<Product> filterProducts(@RequestBody FilterDTO filterDTO) {
		List<Product> products = productService.filter(filterDTO);
		return products;
	}

	@GetMapping("/range")
	public List<Product> productByPriceRange(@RequestParam Double fPrice, @RequestParam Double tPrice) {
		return productService.priceRange(fPrice, tPrice);
	}

	@GetMapping("/search")
	public List<Product> searchByName(@RequestParam String name) {
		return productService.searchByName(name);
	}

}