CREATE TABLE users (
  id bigint NOT NULL,
  name varchar(255) NOT NULL,
  email varchar(255) NOT NULL,
  password varchar(255) NOT NULL,
  PRIMARY KEY (id)
) ;

CREATE TABLE addresses (
  id bigint NOT NULL,
  street varchar(255) NOT NULL,
  city varchar(255) NOT NULL,
  zip varchar(255) NOT NULL,
  user_id bigint NOT NULL,
  PRIMARY KEY (id),
  KEY user_address_idx (user_id),
  CONSTRAINT user_address FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE
);
