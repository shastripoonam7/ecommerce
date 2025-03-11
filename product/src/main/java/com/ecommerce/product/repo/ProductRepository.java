package com.ecommerce.product.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.product.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

}
