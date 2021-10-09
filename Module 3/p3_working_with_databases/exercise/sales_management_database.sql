create database quanlybanhang;
use quanlybanhang;

create table Customer(
	cID int not null auto_increment primary key,
    nameCustomer varchar(25) not null,
    cAge int not null
);

create table Ordered(
	oID int not null auto_increment primary key,
    cID int not null,
    oDate datetime,
    oTotalPrice int,
    foreign key (cID) references Customer(cID)
);

create table Product(
	pID int not null auto_increment primary key,
    pName varchar(25) not null,
    pPrice int not null
);

create table OrderDetail(
	oID int not null,
    pID int not null,
    odQTY int,
    unique(oID, pID),
    foreign key (oID) references Ordered(oID),
    foreign key (pID) references Product(pID)
);

insert into Customer(nameCustomer, cAge)
values('Minh Quan', 10);
insert into Customer(nameCustomer, cAge)
values('Ngoc Oanh', 20);
insert into Customer(nameCustomer, cAge)
values('Hong Ha', 50);

insert into Ordered(cID, oDate, oTotalPrice)
values(1, '2006-03-21', null);
insert into Ordered(cID, oDate, oTotalPrice)
values(2, '2006-03-23', null);
insert into Ordered(cID, oDate, oTotalPrice)
values(1, '2006-03-16', null);

insert into Product(pName, pPrice)
values ('May giat', 3),
	   ('Tu lanh', 5),
       ('Dieu hoa', 7),
       ('Quat', 1),
       ('Bep dien', 2);
       
insert into OrderDetail(oID, pID, odQTY)
values(1, 1, 3),
      (1, 3, 7),
      (1, 4, 2),
      (2, 1, 1),
      (3, 1, 8),
      (2, 5, 4),
      (2, 3, 3);
      
select * from Customer;
-- 1. Hien thi tat ca cac field trong bang order
select * from Ordered;

-- 2. Hien thi danh sach khach hang da mua hang
-- Va danh sach cac san pham duoc mua boi khach hang
select nameCustomer, pName, odQTY
from Customer join Ordered on Customer.cID = Ordered.cID join OrderDetail on OrderDetail.oID = Ordered.oID 
join Product on OrderDetail.pID = Product.pID;

-- 3. Hien thi danh sach khach hang khong mua san pham
select nameCustomer
from Customer
where Customer.cID not in (select Ordered.cID from Ordered);

-- 4. Hien thi ma hoa don, ngay ban va gia tien cua tung hoa don.
select Ordered.oID, Ordered.oDate, sum(Product.pPrice * orderDetail.odQTY) 
from Ordered join orderDetail on Ordered.oID = orderDetail.oID
join Product on Product.pID = orderDetail.pID
group by Ordered.oID;
