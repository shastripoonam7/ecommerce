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

import com.ecommerce.product.model.Category;
import com.ecommerce.product.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {
	
	private CategoryService categoryService;

	public CategoryController(CategoryService categoryService) {
		super();
		this.categoryService = categoryService;
	}
	
	@PostMapping
	public ResponseEntity<Category> saveCategory(@RequestBody Category category) {
		categoryService.saveCategory(category);
		return new  ResponseEntity<>(category,HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){
		Category category = categoryService.findById(id);
		return new ResponseEntity<>(category,HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Category> >findAllCategory(){
		List<Category> list= categoryService.fetchAll();
		return new ResponseEntity<>(list, HttpStatus.OK);
	}

}
