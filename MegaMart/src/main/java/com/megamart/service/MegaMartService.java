package com.megamart.service;

import com.megamart.entity.Product;

public interface MegaMartService {

	public void saveProduct(Product product);

	public Product getProductById(int productId);

	public void deleteProduct(int ProductId);

	public Product updateProduct(Product product);

}
