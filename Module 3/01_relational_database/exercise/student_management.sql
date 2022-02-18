create database students_management;

use students_management;

create table Students(
	id int primary key auto_increment,
    `name` varchar(50) null,
    age int null,
    country varchar(50) null
);

create table Class(
	id int primary key,
    `name` varchar(50) null
);

create table Teacher(
	id int primary key auto_increment,
    `name` varchar(50) null,
    age int null,
    country varchar(50)
);