create table products (
    id bigserial primary key,
    code varchar(20) not null unique,
    name varchar(255) not null,
    price numeric not null
);

insert into products (code, name, price) values ('PR-0001', 'MacBook Pro', 1000.00);
insert into products (code, name, price) values ('PR-0002', 'iPhone 12', 800.00);
insert into products (code, name, price) values ('PR-0003', 'iPad Pro', 600.00);