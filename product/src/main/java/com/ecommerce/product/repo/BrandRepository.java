package com.ecommerce.product.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.product.model.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand,Long> {

}
