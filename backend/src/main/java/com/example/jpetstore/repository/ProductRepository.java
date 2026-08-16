package com.example.jpetstore.repository;

import com.example.jpetstore.entity.Product;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> { List<Product> findByCategoryId(Long categoryId); }
