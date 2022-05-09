drop table if exists user;
CREATE TABLE user
(
    id   uuid default random_uuid() PRIMARY KEY,
    name VARCHAR(255),
    age  int
);

insert into user (name, age) values ('김나나', 32);
insert into user (name, age) values ('박지운', 24);
insert into user (name, age) values ('백오준', 18);
insert into user (name, age) values ('최향소', 27);
insert into user (name, age) values ('이연명', 19);
insert into user (name, age) values ('최초롱', 42);
insert into user (name, age) values ('김복남', 9);
insert into user (name, age) values ('서한준', 29);