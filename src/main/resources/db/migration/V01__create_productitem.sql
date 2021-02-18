CREATE TABLE product_item
(
    id   BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(150) NOT NULL,
    place_name VARCHAR(150) NOT NULL,
    price VARCHAR(150) NOT NULL,
    place_url VARCHAR(150) NOT NULL,
    product_url VARCHAR(150) NOT NULL,
    query VARCHAR(150) NOT NULL,
    original_query VARCHAR(150) NOT NULL,
    product_img_url VARCHAR(150) NOT NULL,
    last_updated VARCHAR(150) NOT NULL,
    metadata VARCHAR(150) NOT NULL

) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;