CREATE TABLE product
(
    id          BIGINT AUTO_INCREMENT PRIMARY KEY,
    name        VARCHAR(255)   NOT NULL UNIQUE,
    price       DECIMAL(10, 2) NOT NULL,
    quantity    INT            NOT NULL,
    description VARCHAR(500)   NOT NULL,
    url_image   TEXT,
    created_at  TIMESTAMP      NOT NULL,
    updated_at  TIMESTAMP
);