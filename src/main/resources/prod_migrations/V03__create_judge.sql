CREATE TABLE judge
(
    id       BIGINT(20) PRIMARY KEY,
    name     VARCHAR(64) NOT NULL,
    username VARCHAR(32) NOT NULL
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;