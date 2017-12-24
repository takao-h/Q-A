create table user(
id bigint(20) NOT NULL AUTO_INCREMENT,
mail VARCHAR(500) NOT NULL,
password VARCHAR(1024) NOT NULL,
twitter_id VARCHAR(1024),
twitter_access_token VARCHAR(255),
PRIMARY KEY (id)
)