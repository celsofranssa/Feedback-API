CREATE TABLE feedback
(
    id   BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    rating BIGINT(20) NOT NULL,
    item_id BIGINT(20) NOT NULL,
    FOREIGN KEY (item_id) REFERENCES product_item(id)

) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;