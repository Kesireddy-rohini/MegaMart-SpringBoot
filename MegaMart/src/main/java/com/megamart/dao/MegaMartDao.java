package com.megamart.dao;

import java.util.ArrayList;

import com.megamart.entity.Product;

public interface MegaMartDao {

	public void saveProduct(Product product);

	public Product getProductId(int productId);

	public void deleteProduct(int productId);

	public Product updateProduct(Product product);
	
	public ArrayList<Product> getProductByName(String productName);

	public ArrayList<Product> findByProductPrice(float productPrice);

	public ArrayList<String> findByQuantityAndRating(int quantity, float rating);

}
