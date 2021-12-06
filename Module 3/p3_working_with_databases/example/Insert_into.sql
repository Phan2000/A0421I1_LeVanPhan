create database quanlysinhvien;
use quanlysinhvien;
create table class
(
    id   int         auto_increment primary key,
    name varchar(60) not null,
    start_date datetime    not null,
    status    bit
);
create table student
(
    id   int         auto_increment primary key,
    name varchar(30) not null,
    address     varchar(50),
    phone       varchar(20),
    status      bit,
    class_id     int         not null,
    foreign key (class_id) references class (id)
);
create table subject
(
    id   int         auto_increment primary key,
    name varchar(30) not null,
    credit  tinyint     not null default 1 check ( credit >= 1 ),
    status  bit                  default 1
);

create table mark
(
    id    int not null auto_increment primary key,
    sub_id     int not null,
    student_id int not null,
    mark      float   default 0 check ( mark between 0 and 100),
    examtimes tinyint default 1,
    unique (sub_id, student_id),
    foreign key (sub_id) references subject (id),
    foreign key (student_id) references student (id)
);

insert into class(name, start_date, status)
values ('a1', '2008-12-20', 1);
insert into class(name, start_date, status)
values ('a2', '2008-12-22', 1);
insert into class(name, start_date, status)
values ('b3', current_date, 0);

insert into student (name, address, phone, status, class_id)
values ('hung', 'ha noi', '0912113113', 1, 1);
insert into student (name, address, status, class_id)
values ('hoa', 'hai phong', 1, 1);
insert into student (name, address, phone, status, class_id)
values ('manh', 'hcm', '0123123123', 0, 2);

insert into subject
values (1, 'cf', 5, 1),
       (2, 'c', 6, 1),
       (3, 'hdj', 5, 1),
       (4, 'rdbms', 10, 1);

insert into mark (sub_id, student_id, mark, examtimes)
values (1, 1, 8, 1),
       (1, 2, 10, 2),
       (2, 1, 12, 1);
       
-- select * from student
-- where status = true

-- select * from subject
-- where credit >= 10

-- select * from class

-- select s.id, s.name, c.name
-- from student s join class c on s.class_id = c.id
-- where c.name = 'a1';
   
select s.id, s.name, sub.name, m.mark
from student s join mark m on s.id = m.student_id join subject sub on m.sub_id = sub.id
where sub.name = 'cf';