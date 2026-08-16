package com.example.jpetstore.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "categories", indexes = @Index(name = "idx_category_code", columnList = "code", unique = true))
public class Category {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
    @NotBlank @Size(max = 20) @Column(nullable = false, unique = true, length = 20) private String code;
    @NotBlank @Size(max = 100) @Column(nullable = false, length = 100) private String name;
    @Size(max = 500) @Column(length = 500) private String description;
    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, orphanRemoval = true) private List<Product> products = new ArrayList<>();
    protected Category() { }
    public Category(String code, String name, String description) { this.code = code; this.name = name; this.description = description; }
    public void addProduct(Product product) { products.add(product); product.setCategory(this); }
    public Long getId() { return id; }
    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public List<Product> getProducts() { return products; }
    public void setProducts(List<Product> products) { this.products = products; }
}
