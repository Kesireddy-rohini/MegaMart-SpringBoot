package com.megamart.service;

import java.util.ArrayList;

import com.megamart.entity.Product;

public interface MegaMartService {

	public void saveProduct(Product product);

	public Product getProductById(int productId);

	public void deleteProduct(int ProductId);

	public Product updateProduct(Product product);

	public ArrayList<Product> getProductByName(String productName);

	public ArrayList<Product> findByProductPrice(float productPrice);

	public ArrayList<String> findByProductPrice(int quantity, float rating);
}
