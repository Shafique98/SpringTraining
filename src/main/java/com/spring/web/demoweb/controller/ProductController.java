package com.spring.web.demoweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.web.demoweb.modal.Product;
import com.spring.web.demoweb.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	ProductService productService;

	@RequestMapping("/products")
	public List<Product> getProducts() {

		return productService.getProducts();
	}

	@GetMapping("/products/{prodID}")
	public Product getProductByID(@PathVariable int prodID) {
		return productService.getProductByID(prodID);
	}

	@PostMapping("/products")
	public void addProduct(@RequestBody Product product) {
		productService.addProduct(product);
	}
	@PutMapping("/products")
	public void updateProduct(@RequestBody Product product) {
		productService.updateProduct(product);
	}
	
}
