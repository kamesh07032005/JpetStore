-- Run this file in MySQL Workbench before starting the backend.

CREATE DATABASE IF NOT EXISTS jpetstore;
USE jpetstore;

CREATE TABLE categories (
    id BIGINT NOT NULL AUTO_INCREMENT,
    code VARCHAR(20) NOT NULL,
    name VARCHAR(100) NOT NULL,
    description VARCHAR(500),
    PRIMARY KEY (id)
);

CREATE TABLE products (
    id BIGINT NOT NULL AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    description VARCHAR(500),
    category_id BIGINT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (category_id) REFERENCES categories(id)
);

CREATE TABLE items (
    id BIGINT NOT NULL AUTO_INCREMENT,
    sku VARCHAR(40) NOT NULL,
    description VARCHAR(500),
    list_price DECIMAL(10,2) NOT NULL,
    quantity INT NOT NULL,
    product_id BIGINT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (product_id) REFERENCES products(id)
);

INSERT INTO categories (code, name, description) VALUES
('FISH', 'Fish', 'Freshwater and saltwater fish'),
('DOGS', 'Dogs', 'Dogs and puppy supplies'),
('CATS', 'Cats', 'Cats and kitten supplies'),
('REPTILES', 'Reptiles', 'Reptiles and terrarium pets'),
('BIRDS', 'Birds', 'Birds and aviary pets');

INSERT INTO products (name, description, category_id) VALUES
('Angelfish', 'Large Angelfish', 1),
('Bulldog', 'Adult Female Bulldog', 2),
('Manx', 'Tailless cat', 3),
('Iguana', 'Green adult iguana', 4),
('Amazon Parrot', 'Adult male Amazon parrot', 5);

INSERT INTO items (sku, description, list_price, quantity, product_id) VALUES
('EST-1', 'Large Angelfish', 16.50, 10, 1),
('K9-BD-01', 'Adult Female Bulldog', 18.50, 10, 2),
('FL-DLH-02', 'Tailless cat', 58.50, 10, 3),
('RP-LI-02', 'Green adult iguana', 18.50, 10, 4),
('AV-CB-01', 'Adult male Amazon parrot', 193.50, 10, 5);
