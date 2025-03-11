package com.ecommerce.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ecommerce.product.exception.ProductNotFoundException;
import com.ecommerce.product.model.Product;
import com.ecommerce.product.repo.BrandRepository;
import com.ecommerce.product.repo.CategoryRepository;
import com.ecommerce.product.repo.ProductRepository;
import com.ecommerce.product.repo.SellerRepository;

@Service
public class ProductService {
	
	private ProductRepository productRepository;
	private CategoryRepository categoryRepository;
	private SellerRepository sellerRepository;
	private BrandRepository brandRepository;
	
	public ProductService(ProductRepository productRepository, CategoryRepository categoryRepository,
			SellerRepository sellerRepository, BrandRepository brandRepository) {
		super();
		this.productRepository = productRepository;
		this.categoryRepository = categoryRepository;
		this.sellerRepository = sellerRepository;
		this.brandRepository = brandRepository;
	}
	
	public Product saveProduct(Product product) {
		productRepository.save(product);
		return product;
	}
	
	public Product findById(Long id) {
		Product product = productRepository.findById(id).orElseThrow(()-> new ProductNotFoundException("Product not Found!"));
		return product;
	}
	
	public List<Product> fetchAllProducts(){
		List<Product> list = productRepository.findAll();
		return list;
	}
	

}
