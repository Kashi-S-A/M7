package com.tyss.ps.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.test.model.Product;

@RestController
@RequestMapping("/pd")
public class ProductController {

	@GetMapping("/data")
	public String getData(@RequestParam(name = "id") Integer pid, @RequestParam String name) {
		System.out.println("ProductId : " + pid);
		System.out.println("Name : " + name);
		return "Pid : " + pid + ", Name : " + name;
	}

	@GetMapping("/path/{id}/{price}")
	public String pathData(@PathVariable(name = "id") Integer prodId, @PathVariable double price) {
		System.out.println("Product Id : " + prodId);
		System.out.println(price);
		return "Product Id : " + prodId;
	}

	@GetMapping("/head")
	public String headData(@RequestHeader String token) {
		System.out.println("token : " + token);
		return "HEader data";
	}

	@GetMapping("/body")
	public Product bodyData(@RequestBody Product product) {
		System.out.println(product);
		return product;
	}

}
