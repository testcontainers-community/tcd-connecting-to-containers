create table promotions (
    id bigserial primary key,
    code varchar(20) not null unique,
    discount numeric not null
);

insert into promotions (code, discount) values ('PR-0001', 0.10);
insert into promotions (code, discount) values ('PR-0002', 0.20);
insert into promotions (code, discount) values ('PR-0003', 0.30);
