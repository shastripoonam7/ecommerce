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

import com.ecommerce.product.model.Brand;
import com.ecommerce.product.service.BrandService;

@RestController
@RequestMapping("/brand")
public class BrandController {
	private BrandService brandService;

	public BrandController(BrandService brandService) {
		super();
		this.brandService = brandService;
	}
	
	@PostMapping
	public ResponseEntity<Brand> saveBrand(@RequestBody Brand brand) {
		brandService.saveBrand(brand);
		return new ResponseEntity<>(brand,HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Brand> findById(@PathVariable Long id){
		Brand brand = brandService.findById(id);
		return new ResponseEntity<>(brand,HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Brand>> fetchAll(){
		List<Brand> list = brandService.fetchAll();
		return new ResponseEntity<>(list,HttpStatus.OK);
	}
	

}
