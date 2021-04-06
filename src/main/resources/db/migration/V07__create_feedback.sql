CREATE TABLE feedback
(
    id             BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    rating         BIGINT(20) NOT NULL,
    product_id     BIGINT(20) NOT NULL,
    description_id BIGINT(20) NOT NULL,
    judge_id       BIGINT(20) NOT NULL,
    comment        VARCHAR(1024),
    FOREIGN KEY (product_id) REFERENCES product (id),
    FOREIGN KEY (description_id) REFERENCES description (id),
    FOREIGN KEY (judge_id) REFERENCES judge (id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;