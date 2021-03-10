CREATE TABLE product
(
    id              BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    name            VARCHAR(512)  NOT NULL,
    place_name      VARCHAR(512)  NOT NULL,
    price           VARCHAR(512)  NOT NULL,
    place_url       VARCHAR(512)  NOT NULL,
    product_url     VARCHAR(150)  NOT NULL,
    product_img_url VARCHAR(1024) NOT NULL,
    last_updated    VARCHAR(64)   NOT NULL,
    metadata        VARCHAR(128)  NOT NULL,
    description_id  BIGINT(20) NOT NULL,
    FOREIGN KEY (description_id) REFERENCES description (id)

) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;
