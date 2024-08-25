package com.megamart.dao;

import com.megamart.entity.Product;

public interface MegaMartDao {

	public void saveProduct(Product product);

	public Product getProductId(int productId);

	public void deleteProduct(int productId);

	public Product updateProduct(Product product);

}
