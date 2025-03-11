package com.ecommerce.product.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.product.model.Seller;

@Repository
public interface SellerRepository extends JpaRepository<Seller,Long>{

}
