package com.example.jpetstore.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;

@Entity
@Table(name = "items", indexes = @Index(name = "idx_item_sku", columnList = "sku", unique = true))
public class Item {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
    @NotBlank @Size(max = 40) @Column(nullable = false, unique = true, length = 40) private String sku;
    @Size(max = 500) @Column(length = 500) private String description;
    @NotNull @DecimalMin(value = "0.00") @Column(nullable = false, precision = 10, scale = 2) private BigDecimal listPrice;
    @NotNull @Min(0) @Column(nullable = false) private Integer quantity;
    @ManyToOne(fetch = FetchType.LAZY, optional = false) @JoinColumn(name = "product_id", nullable = false) private Product product;
    protected Item() { }
    public Item(String sku, String description, BigDecimal listPrice, Integer quantity) { this.sku = sku; this.description = description; this.listPrice = listPrice; this.quantity = quantity; }
    public void setProduct(Product product) { this.product = product; }
    public Long getId() { return id; }
    public String getSku() { return sku; }
    public void setSku(String sku) { this.sku = sku; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public BigDecimal getListPrice() { return listPrice; }
    public void setListPrice(BigDecimal listPrice) { this.listPrice = listPrice; }
    public Integer getQuantity() { return quantity; }
    public void setQuantity(Integer quantity) { this.quantity = quantity; }
    public Product getProduct() { return product; }
}
