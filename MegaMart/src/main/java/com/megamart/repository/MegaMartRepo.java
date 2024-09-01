package com.megamart.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.megamart.entity.Product;

@Repository
public interface MegaMartRepo extends JpaRepository<Product, Integer> {
	
	public ArrayList<Product> findByProductName(String productName);

	@Query("SELECT p FROM Product p WHERE p.productPrice = :XYZ")
	public ArrayList<Product> findByProductPrice(@Param("XYZ")float productPrice);
	
	@Query("SELECT productName FROM Product p WHERE p.quantity > :quant  AND p.rating < :rate ")
	public  ArrayList<String>  findByQuantityAndRating(@Param("quant")int quantity,@Param("rate")float rating);
	
}
