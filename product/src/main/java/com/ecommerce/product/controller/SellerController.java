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

import com.ecommerce.product.model.Seller;
import com.ecommerce.product.service.SellerService;

@RestController
@RequestMapping("/seller")
public class SellerController {
	
	private SellerService sellerService;

	public SellerController(SellerService sellerService) {
		super();
		this.sellerService = sellerService;
	}
	
	@PostMapping
	public ResponseEntity<Seller> saveSeller(@RequestBody Seller seller) {
		sellerService.saveSeller(seller);
		return new ResponseEntity<>(seller,HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Seller> findById(@PathVariable Long id){
		Seller seller = sellerService.findById(id);
		return new ResponseEntity<>(seller,HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Seller>> findAll(){
		List<Seller> list = sellerService.fetchAll();
		return new ResponseEntity<>(list,HttpStatus.OK);
	}

}
