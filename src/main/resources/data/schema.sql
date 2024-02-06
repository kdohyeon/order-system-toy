DROP TABLE IF EXISTS products;

CREATE TABLE products
(
    product_id  INT            NOT NULL AUTO_INCREMENT,
    name        VARCHAR(100)   NOT NULL,
    description VARCHAR(200) NULL,
    price       DECIMAL(10, 2) NOT NULL,
    PRIMARY KEY (product_id)
);

DROP TABLE IF EXISTS orders;

CREATE TABLE orders
(
    order_id    INT      NOT NULL AUTO_INCREMENT,
    customer_id INT      NOT NULL,
    ordered_at   DATETIME NOT NULL,
    PRIMARY KEY (order_id)
);

DROP TABLE IF EXISTS order_items;

CREATE TABLE order_items
(
    order_item_id  INT NOT NULL AUTO_INCREMENT,
    product_id     INT NOT NULL,
    order_id       INT NOT NULL,
    order_quantity INT NOT NULL,
    PRIMARY KEY (order_item_id)
);

DROP TABLE IF EXISTS customers;

CREATE TABLE customers
(
    customer_id  INT          NOT NULL AUTO_INCREMENT,
    name         VARCHAR(100) NOT NULL,
    phone_number VARCHAR(100) NULL,
    address      VARCHAR(100) NOT NULL,
    PRIMARY KEY (customer_id)
);
