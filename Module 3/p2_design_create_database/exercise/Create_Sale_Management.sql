create database sale_management;
use sale_management;

create table Customer(
	customerID int not null auto_increment primary key,
    customerName varchar(45) not null,
    customerAge int not null
);

create table Ordered(
	orderID int not null auto_increment primary key,
    orderDate date,
    orderTotalPrice double not null,
    customerID int not null,
    foreign key (customerID) references customer(customerID)
);

create table product(
	productID int not null auto_increment primary key,
    productName varchar(45) not null,
    productPrice double not null
);

create table order_detail(
	orderID int not null,
    productID int not null,
	unique(orderID, productID),
    foreign key (orderID) references Ordered(orderID),
    foreign key (productID) references product(productID)
);