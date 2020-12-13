package com.microservice.productservice;

import java.util.List;

public class Product {
    
	private List<String> productList;
	private int discountPercentage;
	private int port;
	
	public Product(int discountPercentage, int port, List<String> productList) {
		this.setDiscountPercentage(discountPercentage);
		this.setPort(port);
		this.setProductList(productList);
		
	}
	public List<String> getProductList() {
		return productList;
	}
	public void setProductList(List<String> productList) {
		this.productList = productList;
	}
	public int getDiscountPercentage() {
		return discountPercentage;
	}
	public void setDiscountPercentage(int discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	
	
	
	
}
