package com.ecommerce.product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce.product.exception.ProductNotFoundException;
import com.ecommerce.product.model.Brand;
import com.ecommerce.product.model.Seller;
import com.ecommerce.product.repo.BrandRepository;

@Service
public class BrandService {
	private BrandRepository brandRepository;

	public BrandService(BrandRepository brandRepository) {
		super();
		this.brandRepository = brandRepository;
	}
	
	public Brand saveBrand(Brand brand) {
		brandRepository.save(brand);
		return brand;
	}
	
	public Brand findById(Long id) {
		Brand brand = brandRepository.findById(id).orElseThrow(()-> new ProductNotFoundException("Brand not Found!"));
		return brand;
	}
	
	public List<Brand> fetchAll(){
		List<Brand> list = brandRepository.findAll();
		return list;
	}

}
