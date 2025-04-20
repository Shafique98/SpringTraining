package com.spring.web.demoweb.modal;

import org.springframework.stereotype.Component;

//@Data
//@AllArgsConstructor
@Component
public class Product {
	private int prodID;
	private String prodName;
	private int prodPrize;

	public Product() {
	}

	public Product(int prodID, String prodName, int prodPrize) {
		this.prodID = prodID;
		this.prodName = prodName;
		this.prodPrize = prodPrize;
	}

	public int getProdID() {
		return prodID;
	}

	public void setProdID(int prodID) {
		this.prodID = prodID;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public int getProdPrize() {
		return prodPrize;
	}

	public void setProdPrize(int prodPrize) {
		this.prodPrize = prodPrize;
	}

	@Override
	public String toString() {

		return this.prodID + " " + this.prodName + " " + this.prodPrize;
	}
}
