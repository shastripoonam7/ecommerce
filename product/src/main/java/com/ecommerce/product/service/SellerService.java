package com.ecommerce.product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce.product.exception.ProductNotFoundException;
import com.ecommerce.product.model.Category;
import com.ecommerce.product.model.Seller;
import com.ecommerce.product.repo.SellerRepository;

@Service
public class SellerService {
	
	private SellerRepository sellerRepository;

	public SellerService(SellerRepository sellerRepository) {
		super();
		this.sellerRepository = sellerRepository;
	}
	
	public Seller saveSeller(Seller seller) {
		sellerRepository.save(seller);
		return seller;
	}
	
	public Seller findById(Long id) {
		Seller seller = sellerRepository.findById(id).orElseThrow(()-> new ProductNotFoundException("Seller not Found!"));
		return seller;
	}
	
	public List<Seller> fetchAll(){
		List<Seller> list = sellerRepository.findAll();
		return list;
	}

}
