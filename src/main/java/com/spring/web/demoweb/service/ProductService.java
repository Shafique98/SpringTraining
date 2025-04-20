package com.spring.web.demoweb.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.web.demoweb.modal.Product;

@Service
public class ProductService {
	List<Product> products = new ArrayList<>(Arrays.asList(
			new Product(101, "Iphone", 5000),
			new Product(102, "Canon", 45000),
			new Product(103, "Microphone", 5450)));

	public List<Product> getProducts() {
		return products;
	}

	public Product getProductByID(int prodID) {
		return products.stream().filter(p -> p.getProdID() == prodID).findFirst().orElse(new Product(prodID, "No item",0));
	}
	
	
}
