create database sale_management;
use sale_management;

create table customer(
	id int auto_increment primary key,
    name varchar(45) not null,
    age int not null
);

create table ordered(
	id int auto_increment primary key,
    date date,
    total_price double not null,
    customer_id int not null,
    foreign key (customer_id) references customer(id)
);

create table product(
	id int auto_increment primary key,
    name varchar(45) not null,
    price double not null
);

create table order_detail(
	order_id int,
    product_id int,
	unique(order_id, product_id),
    foreign key (order_id) references ordered(id),
    foreign key (product_id) references product(id)
);