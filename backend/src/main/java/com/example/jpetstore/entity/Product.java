package com.example.jpetstore.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "products", indexes = @Index(name = "idx_product_category", columnList = "category_id"))
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
    @NotBlank @Size(max = 100) @Column(nullable = false, length = 100) private String name;
    @Size(max = 500) @Column(length = 500) private String description;
    @ManyToOne(fetch = FetchType.LAZY, optional = false) @JoinColumn(name = "category_id", nullable = false) private Category category;
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true) private List<Item> items = new ArrayList<>();
    protected Product() { }
    public Product(String name, String description) { this.name = name; this.description = description; }
    public void setCategory(Category category) { this.category = category; }
    public void addItem(Item item) { items.add(item); item.setProduct(this); }
    public Long getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public Category getCategory() { return category; }
    public List<Item> getItems() { return items; }
    public void setItems(List<Item> items) { this.items = items; }
}
