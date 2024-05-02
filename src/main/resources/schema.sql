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

TRUNCATE TABLE flowers.flower;

INSERT INTO flowers.flower (name, price) VALUES
('Sugar Rush', 54),
('Lemonade', 54),
('The Angels', 54),
('unbreakable', 59),
('Sierra Sunset', 59),
('Casablanca', 59);