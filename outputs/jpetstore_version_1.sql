-- JPetStore Version 1: Simple MySQL setup
-- Run this whole file in MySQL Workbench.

CREATE DATABASE IF NOT EXISTS jpetstore;

USE jpetstore;

-- A category is a main pet type, for example Fish or Dogs.
CREATE TABLE categories (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    code VARCHAR(20) NOT NULL,
    name VARCHAR(100) NOT NULL,
    description VARCHAR(500)
);

-- A product belongs to one category.
CREATE TABLE products (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    description VARCHAR(500),
    category_id BIGINT NOT NULL,
    FOREIGN KEY (category_id) REFERENCES categories(id)
);

-- An item belongs to one product and has price and stock.
CREATE TABLE items (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    sku VARCHAR(40) NOT NULL,
    description VARCHAR(500),
    list_price DECIMAL(10,2) NOT NULL,
    quantity INT NOT NULL,
    product_id BIGINT NOT NULL,
    FOREIGN KEY (product_id) REFERENCES products(id)
);

-- Insert the five main pet categories.
INSERT INTO categories (code, name, description) VALUES
('FISH', 'Fish', 'Freshwater and saltwater fish'),
('DOGS', 'Dogs', 'Dogs and puppy supplies'),
('CATS', 'Cats', 'Cats and kitten supplies'),
('REPTILES', 'Reptiles', 'Reptiles and terrarium pets'),
('BIRDS', 'Birds', 'Birds and aviary pets');

-- Insert one simple product for each category.
INSERT INTO products (name, description, category_id) VALUES
('Angelfish', 'Large Angelfish', 1),
('Bulldog', 'Adult Female Bulldog', 2),
('Manx', 'Tailless cat', 3),
('Iguana', 'Green adult iguana', 4),
('Amazon Parrot', 'Adult male Amazon parrot', 5);

-- Insert one item for each product.
INSERT INTO items (sku, description, list_price, quantity, product_id) VALUES
('EST-1', 'Large Angelfish', 16.50, 10, 1),
('K9-BD-01', 'Adult Female Bulldog', 18.50, 10, 2),
('FL-DLH-02', 'Tailless cat', 58.50, 10, 3),
('RP-LI-02', 'Green adult iguana', 18.50, 10, 4),
('AV-CB-01', 'Adult male Amazon parrot', 193.50, 10, 5);

-- Check the inserted data.
SELECT * FROM categories;
SELECT * FROM products;
SELECT * FROM items;
