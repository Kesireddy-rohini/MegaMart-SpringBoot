package com.megamart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.megamart.dao.MegaMartDao;
import com.megamart.entity.Product;

@Service
public class MegaMartServiceImpl implements MegaMartService {

	@Autowired
	private MegaMartDao megaMartDao;
	
	@Override
	public void saveProduct(Product product) {
		
	megaMartDao.saveProduct(product);
		
	}

	@Override
	public Product getProductById(int productId) {
		return megaMartDao.getProductId(productId);
		
	}

	@Override
	public void deleteProduct(int productId) {
	megaMartDao.deleteProduct(productId);
		
	}

	@Override
	public Product updateProduct(Product product) {
		
		return megaMartDao.updateProduct(product);
	}

}
