package com.nilcelso.springprojectproduct.resources;

import com.nilcelso.springprojectproduct.entities.Category;
import com.nilcelso.springprojectproduct.entities.Product;
import com.nilcelso.springprojectproduct.repositpries.CategoryRepository;
import com.nilcelso.springprojectproduct.repositpries.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

    @Autowired
    private ProductRepository categoryRepository;

    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        List<Product> list = categoryRepository.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id){
        Product cat = categoryRepository.findById(id).get();
        return ResponseEntity.ok().body(cat);
    }

}
//https://www.youtube.com/watch?v=nQr_X62vq-k
