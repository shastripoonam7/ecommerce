package com.ecommerce.product.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private int price;
	private int stock;
	@OneToOne
	@JoinColumn(name="category_id")
	private Category category;
	
	 @ManyToOne
	@JoinColumn(name = "seller_id")
	private Seller seller;
	
	@ManyToOne
	@JoinColumn(name="brand_id")
	private Brand brand;
	
}
