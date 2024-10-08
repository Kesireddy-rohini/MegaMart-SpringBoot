package com.megamart.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.megamart.entity.Product;
import com.megamart.service.MegaMartService;

@RestController
public class MegaMartController {
	
	@Autowired
	private MegaMartService megaMartService;
	
	@PostMapping("/saveProduct")
	public void saveProduct(@RequestBody Product product) {
		
		 megaMartService.saveProduct(product);
	}
	
	@GetMapping("/getProductById")
	public Product getProductById(@RequestParam int productId) {
		
		return megaMartService.getProductById(productId);
		
	}
	
	@DeleteMapping("/deleteProduct/{productId}")
	public String deleteProduct(@PathVariable int productId ) {
		megaMartService.deleteProduct(productId);
		return "Product is deleted";
		
	}
	
	@PutMapping("/updateProduct")
	public Product updateProduct(@RequestBody Product product ) {
		
		return megaMartService.updateProduct(product);
		
	}
	
	@GetMapping("/getProductsByName")
	public ArrayList<Product> getProductByName(@RequestParam String productName){
		
		return megaMartService.getProductByName(productName);
		
	}
	
	@GetMapping("/findByProductPrice")
	public ArrayList<Product> findByProductPrice(@RequestParam float productPrice){
		return megaMartService.findByProductPrice(productPrice);
	}
	
	@GetMapping("/findByQuantityAndRating")
	public ArrayList<String> findByQuantityAndRating(@RequestParam int quantity , @RequestParam float rating){
		return megaMartService.findByProductPrice(quantity,rating);
			
		
		}
		
	}
	


