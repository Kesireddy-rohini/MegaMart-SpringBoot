package com.megamart.dao;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.megamart.entity.Product;
import com.megamart.repository.MegaMartRepo;

@Repository
public class MegaMartDaoImpl implements MegaMartDao {
	
	@Autowired
	private MegaMartRepo megaMartRepo;
	
	

	@Override
	public void saveProduct(Product product) {
		megaMartRepo.save(product);
		
		
	}

	@Override
	public Product getProductId(int productId) {
		Optional<Product> p = megaMartRepo.findById(productId);
		
		return p.get();
	}

	@Override 
	public void deleteProduct(int productId) {
		megaMartRepo.deleteById(productId);
		
	}

	@Override
	public Product updateProduct(Product product) {
		
		Optional<Product> p = megaMartRepo.findById(product.getProductId());
		Product p1 = p.get();
		//p1.setProductDescription(product.getProductDescription());
		megaMartRepo.save(product);
		return product ;
	}

	@Override
	public ArrayList<Product> getProductByName(String productName) {
		return megaMartRepo.findByProductName(productName);
	
	}

	@Override
	public ArrayList<Product> findByProductPrice(float productPrice) {
		
		return megaMartRepo.findByProductPrice(productPrice);
	}

	@Override
	public ArrayList<String> findByQuantityAndRating(int quantity, float rating) {
		
		return megaMartRepo.findByQuantityAndRating(quantity, rating);
	}
	
	


}
