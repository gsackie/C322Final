CREATE SCHEMA IF NOT EXISTS flowers;

CREATE TABLE IF NOT EXISTS flowers.customer (
    username VARCHAR(255) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS flowers.flower (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    price NUMERIC NOT NULL
);

CREATE TABLE IF NOT EXISTS flowers.order (
    id SERIAL PRIMARY KEY,
    username VARCHAR(255) NOT NULL,
    flower_name VARCHAR(255) NOT NULL,
    delivery_address VARCHAR(255) NOT NULL,
    delivery_date DATE NOT NULL,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    price NUMERIC NOT NULL
);

INSERT INTO flowers.flower (id, name, price) VALUES
(1, 'Sugar Rush', 54),
(2, 'Lemonade', 54),
(3, 'The Angels', 54),
(4, 'unbreakable', 59),
(5, 'Sierra Sunset', 59),
(6, 'Casablanca', 59);