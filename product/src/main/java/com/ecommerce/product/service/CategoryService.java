package com.ecommerce.product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce.product.exception.ProductNotFoundException;
import com.ecommerce.product.model.Category;
import com.ecommerce.product.model.Product;
import com.ecommerce.product.repo.CategoryRepository;

@Service
public class CategoryService {
	
	private CategoryRepository categoryRepository;

	public CategoryService(CategoryRepository categoryRepository) {
		super();
		this.categoryRepository = categoryRepository;
	}
	
	public Category saveCategory(Category category) {
		categoryRepository.save(category);
		return category;
	}
	
	public Category findById(Long id) {
		Category category = categoryRepository.findById(id).orElseThrow(()-> new ProductNotFoundException("Category not Found!"));
		return category;
	}
	
	public List<Category> fetchAll(){
		List<Category> list = categoryRepository.findAll();
		return list;
	}

}
