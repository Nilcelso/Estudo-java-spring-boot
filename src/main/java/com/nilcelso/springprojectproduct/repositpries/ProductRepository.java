package com.nilcelso.springprojectproduct.repositpries;

import com.nilcelso.springprojectproduct.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
