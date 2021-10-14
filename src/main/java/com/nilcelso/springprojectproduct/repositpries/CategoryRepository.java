package com.nilcelso.springprojectproduct.repositpries;

import com.nilcelso.springprojectproduct.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
