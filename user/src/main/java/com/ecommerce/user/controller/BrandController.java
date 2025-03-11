package com.ecommerce.user.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.user.model.Brand;
import com.ecommerce.user.service.ProductFeignService;

@RestController
@RequestMapping("/brand")
public class BrandController {
	//@ModelAttribute("user") User user,Model model
	
	private ProductFeignService productFeignService;
	
	public BrandController(ProductFeignService productFeignService) {
		super();
		this.productFeignService = productFeignService;
	}

	@PostMapping
	public Brand saveBrand(@ModelAttribute("brand") Brand brand, Model model) {
		
		//brandService.saveBrand(brand);
		//return new ResponseEntity<>(brand,HttpStatus.CREATED);
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
