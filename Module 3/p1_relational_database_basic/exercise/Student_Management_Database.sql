create database student_management;
use student_management;

create table student(
	`id` int not null,
    `name` varchar(45) null,
    `age` int not null,
    `country` varchar(45) null
);

create table class(
	`id` int not null,
    `name` varchar(45) null
);

create table teacher(
	`id` int not null,
    `name` varchar(45) null,
    `age` int not null,
    `country` varchar(45) null
);

select * from student;
insert into student values(1, "Phan", 21, "Thanh Hoa");
 

