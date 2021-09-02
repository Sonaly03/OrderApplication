create database orderApplication;
use database;

create table members
(
    customer_id   varchar(1) not null
        primary key,
    customer_name varchar(5) null,
    join_date     timestamp  null
);

create table menu
(
    product_id   int        not null
        primary key,
    product_name varchar(5) null,
    price        int        null
);

create table sales
(
    customer_id   varchar(1) null,
    order_date    date       null,
    product_id    int        null,
    order_created datetime   null,
    member        char       not null,
    ranking       int        not null,
    constraint sales_menu_product_id_fk
        foreign key (product_id) references menu (product_id)
);

insert into members (customer_id, customer_name, join_date)
VALUES ('A', 'Anne', STR_TO_DATE('07-01-2021', '%d-%m-%Y')),
('B', 'Bob', STR_TO_DATE('09-01-2021', '%d-%m-%Y'));

insert into menu (product_id, product_name, price)
values (1,'sushi',10),(2,'curry',15),(3,'ramen',12);

insert into sales (customer_id, order_date, product_id)
values ('A',STR_TO_DATE('01-01-2021', '%d-%m-%Y'),1),
       ('A',STR_TO_DATE('01-01-2021', '%d-%m-%Y'),2),

       ('A',STR_TO_DATE('07-01-2021', '%d-%m-%Y'),2),
       ('A',STR_TO_DATE('10-01-2021', '%d-%m-%Y'),3),

       ('A',STR_TO_DATE('11-01-2021', '%d-%m-%Y'),3),
       ('A',STR_TO_DATE('11-01-2021', '%d-%m-%Y'),3),
       ('B',STR_TO_DATE('01-01-2021', '%d-%m-%Y'),2),


       ('B',STR_TO_DATE('02-01-2021', '%d-%m-%Y'),2),
       ('B',STR_TO_DATE('04-01-2021', '%d-%m-%Y'),1),
       ('B',STR_TO_DATE('11-01-2021', '%d-%m-%Y'),1),
       ('B',STR_TO_DATE('16-01-2021', '%d-%m-%Y'),3),

       ('B',STR_TO_DATE('01-02-2021', '%d-%m-%Y'),3),

       ('C',STR_TO_DATE('01-01-2021', '%d-%m-%Y'),3),
       ('C',STR_TO_DATE('01-01-2021', '%d-%m-%Y'),3),
       ('C',STR_TO_DATE('07-02-2021', '%d-%m-%Y'),3);
