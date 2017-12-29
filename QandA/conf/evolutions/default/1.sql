create table user(
id bigint(20) NOT NULL AUTO_INCREMENT,
mail VARCHAR(500) NOT NULL,
password VARCHAR(1024) NOT NULL,
twitter_access_token VARCHAR(255),
facebook_access_token VARCHAR(512),
instagram_access_token VARCHAR(100),
PRIMARY KEY (id)
)

# --- !Downs

DROP TABLE IF EXISTS userRow;