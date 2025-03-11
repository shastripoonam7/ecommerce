package com.ecommerce.product.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.product.model.Product;
import com.ecommerce.product.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	private ProductService productService;

	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}
	
	@PostMapping
	public ResponseEntity<Product> saveProduct(@RequestBody Product product){
		productService.saveProduct(product);
		return new ResponseEntity<>(product,HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id){
		Product product = productService.findById(id);
		return new ResponseEntity<>(product,HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Product>> findAllProducts(){
		List<Product> list = productService.fetchAllProducts();
		return new ResponseEntity<>(list,HttpStatus.OK);
	}
	
}
