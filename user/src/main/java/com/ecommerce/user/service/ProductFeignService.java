package com.ecommerce.user.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ecommerce.user.model.Brand;
import com.ecommerce.user.model.Category;
import com.ecommerce.user.model.Product;
import com.ecommerce.user.model.Seller;

@FeignClient(name = "PRODUCT-SERVICE")
public interface ProductFeignService {
	
	@PostMapping("/brand")
	public Brand saveBrand(@RequestBody Brand brand);
	
	@GetMapping("/brand/{id}")
	public Brand findByIdBrand(@PathVariable Long id);
	
	@GetMapping("/brand")
	public List<Brand> fetchAllBrand();
	
	@PostMapping("/product")
	public Product saveProduct(@RequestBody Product product);
	
	@GetMapping("/product/{id}")
	public Product findByIdProduct(@PathVariable Long id);
	
	@GetMapping("/product")
	public List<Product> findAllProducts();
	
	@PostMapping("/category")
	public Category saveCategory(@RequestBody Category category);
	
	@GetMapping("/category/{id}")
	public Category findByIdCategory(@PathVariable Long id);
	
	@GetMapping("/category")
	public List<Category> findAllCategory();
	
	@PostMapping("/seller")
	public Seller saveSeller(@RequestBody Seller seller);
	
	@GetMapping("/seller/{id}")
	public Seller findByIdSeller(@PathVariable Long id);
	
	@GetMapping("/seller")
	public List<Seller> findAllSeller();
}
