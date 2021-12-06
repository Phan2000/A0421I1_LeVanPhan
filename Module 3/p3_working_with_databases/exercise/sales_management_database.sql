create database quanlybanhang;
use quanlybanhang;

create table customer(
	id int auto_increment primary key,
    name varchar(25) not null,
    age int not null
);

create table ordered(
	id int auto_increment primary key,
    c_id int not null,
    `date` datetime,
    total_price int,
    foreign key (c_id) references customer(id)
);

create table product(
	id int auto_increment primary key,
    name varchar(25) not null,
    price int not null
);

create table order_detail(
	o_id int not null,
    p_id int not null,
    odqty int,
    unique(o_id, p_id),
    foreign key (o_id) references ordered(id),
    foreign key (p_id) references product(id)
);

insert into customer(name, age)
values('minh quan', 10);
insert into customer(name, age)
values('ngoc oanh', 20);
insert into customer(name, age)
values('hong ha', 50);

insert into ordered(c_id, `date`, total_price)
values(1, '2006-03-21', null);
insert into ordered(c_id, `date`, total_price)
values(2, '2006-03-23', null);
insert into ordered(c_id, `date`, total_price)
values(1, '2006-03-16', null);

insert into product(name, price)
values ('may giat', 3),
	   ('tu lanh', 5),
       ('dieu hoa', 7),
       ('quat', 1),
       ('bep dien', 2);
       
insert into order_detail(o_id, p_id, odqty)
values(1, 1, 3),
      (1, 3, 7),
      (1, 4, 2),
      (2, 1, 1),
      (3, 1, 8),
      (2, 5, 4),
      (2, 3, 3);
      
select * from customer;
-- 1. hien thi tat ca cac field trong bang order
select * from ordered;

-- 2. hien thi danh sach khach hang da mua hang
-- va danh sach cac san pham duoc mua boi khach hang
select customer.name, product.name, order_detail.odqty
from customer join ordered on customer.id = ordered.c_id join order_detail on order_detail.o_id = ordered.id 
join product on order_detail.p_id = product.id;

-- 3. hien thi danh sach khach hang khong mua san pham
select name
from customer
where customer.id not in (select ordered.c_id from ordered);

-- 4. hien thi ma hoa don, ngay ban va gia tien cua tung hoa don.
select ordered.id, ordered.`date`, sum(product.price * order_detail.odqty) 
from ordered join order_detail on ordered.id = order_detail.o_id
join product on product.id = orderdetail.p_id
group by ordered.id;
