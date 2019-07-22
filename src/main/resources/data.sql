-- create table person (
--     id integer not null,
--     name varchar(255) not null,
--     location varchar(255),
--     birth_day timestamp,
--     primary key(id)
-- );

INSERT INTO PERSON (id, name, location, birth_date)
VALUES(10001,  'Ranga', 'Hyderabad',sysdate());
INSERT INTO PERSON (id, name, location, birth_date)
VALUES(10002,  'James', 'New York',sysdate());
INSERT INTO PERSON (id, name, location, birth_date)
VALUES(10003,  'Pieter', 'Amsterdam',sysdate());
