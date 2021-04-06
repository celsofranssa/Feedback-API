CREATE TABLE product
(
    id              BIGINT(20) PRIMARY KEY,
    name            VARCHAR(512)  NOT NULL,
    place_name      VARCHAR(512)  NOT NULL,
    prices          VARCHAR(512)  NOT NULL,
    place_url       VARCHAR(512)  NOT NULL,
    product_url     VARCHAR(1024) NOT NULL,
    product_img_url VARCHAR(1024) NOT NULL,
    description_id  BIGINT(20) NOT NULL,
    FOREIGN KEY (description_id) REFERENCES description (id)

) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;
