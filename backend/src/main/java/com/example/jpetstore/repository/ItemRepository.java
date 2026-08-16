package com.example.jpetstore.repository;

import com.example.jpetstore.entity.Item;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> { Optional<Item> findBySku(String sku); }
