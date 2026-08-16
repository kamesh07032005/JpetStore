package com.example.jpetstore.config;

import com.example.jpetstore.entity.Category;
import com.example.jpetstore.entity.Item;
import com.example.jpetstore.entity.Product;
import com.example.jpetstore.repository.CategoryRepository;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.Transactional;

@Configuration
public class CatalogSeedConfig {
    @Bean CommandLineRunner catalogSeedData(CategoryRepository categories) { return args -> seed(categories); }
    @Transactional void seed(CategoryRepository categories) {
        if (categories.count() != 0) return;
        categories.saveAll(List.of(
            category("FISH", "Fish", "Freshwater and saltwater fish", "Angelfish", "Large Angelfish", "EST-1", "fish", "16.50"),
            category("DOGS", "Dogs", "Dogs and puppy supplies", "Bulldog", "Adult Female Bulldog", "K9-BD-01", "dogs", "18.50"),
            category("CATS", "Cats", "Cats and kitten supplies", "Manx", "Tailless cat", "FL-DLH-02", "cats", "58.50"),
            category("REPTILES", "Reptiles", "Reptiles and terrarium pets", "Iguana", "Green adult iguana", "RP-LI-02", "reptiles", "18.50"),
            category("BIRDS", "Birds", "Birds and aviary pets", "Amazon Parrot", "Adult male Amazon parrot", "AV-CB-01", "birds", "193.50")
        ));
    }
    private Category category(String code, String name, String description, String productName, String itemDescription, String sku, String imageName, String price) {
        Category category = new Category(code, name, description);
        Product product = new Product(productName, itemDescription);
        product.addItem(new Item(sku, itemDescription, "/assets/images/" + imageName + ".svg", new BigDecimal(price), 10));
        category.addProduct(product);
        return category;
    }
}
