package com.spring.web.demoweb.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.web.demoweb.modal.Product;
import com.spring.web.demoweb.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;

	List<Product> products = new ArrayList<>(Arrays.asList(new Product(101, "Iphone", 5000),
			new Product(102, "Canon", 45000), new Product(103, "Microphone", 5450)));

	public List<Product> getProducts() {
		return productRepository.findAll();
	}

	public Product getProductByID(int prodID) {
		return productRepository.findById(prodID).orElse(new Product());
	}

	public void addProduct(Product product) {
		productRepository.save(product);
	}

	public void updateProduct(Product product) {
		productRepository.save(product);
	}

	public void deleteProduct(int prodID) {
		productRepository.deleteById(prodID);

	}
}
