package com.ecommerce.user.model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Product {
	
	private long id;
	private String name;
	private int price;
	private int stock;
	private Category category;
	private Seller seller;
	private Brand brand;
	
}
