package com.ecommerce.product.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.product.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {

}
