
CREATE TABLE customers (
  id serial NOT NULL ,
  email varchar(255) DEFAULT NULL,
  first_name varchar(255) DEFAULT NULL,
  last_name varchar(255) DEFAULT NULL,
  phone_number varchar(255) DEFAULT NULL,
  PRIMARY KEY (id)
);



INSERT INTO customers (id, email, first_name, last_name, phone_number) VALUES
(1, 'kate@mail.com', 'Kate', 'Danchenko', '05012311'),
(2, 'alex@mail.com', 'Alex', 'Danchenko', '96234234');

