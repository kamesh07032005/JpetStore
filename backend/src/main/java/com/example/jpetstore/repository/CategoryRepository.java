package com.example.jpetstore.repository;

import com.example.jpetstore.entity.Category;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> { Optional<Category> findByCode(String code); }
