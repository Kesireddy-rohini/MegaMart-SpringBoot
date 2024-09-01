package com.megamart.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	
	@Id
	@GeneratedValue
	private int productId;
	
	@Column(name = "productName")
	private String productName;
	private String productDescription;
	private float productPrice;
	private int quantity;
	private float rating;
	private int category;
	
	}
