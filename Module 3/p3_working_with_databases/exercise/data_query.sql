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
       
-- 1. Lấy thông tin của các học viên tên bắt đầu bằng ký tự "h'
select *
from student
where name like "h%";

-- 2. Hiển thị các thông tin lớp học có thời gian bắt đầu vào tháng 12.
select *
from class
where start_date like "%12%";	

-- 3. Hiển thị tất cả các thông tin môn học có credit trong khoảng từ 3-5.
select *
from subject
where credit between 3 and 5;

-- 5. Hiển thị các thông tin: StudentName, SubName, Mark. 
-- Dữ liệu sắp xếp theo điểm thi (mark) giảm dần. nếu trùng sắp theo tên tăng dần.
select S.name, Sub.name, M.mark
from student S join mark M on S.id = M.student_id join Subject Sub on M.sub_id = Sub.id
order by mark desc;

-- 4. Thay đổi mã lớp(ClassID) của sinh viên có tên ‘Hung’ là 2.
update student
set class_id = 2
where name = "Hung"

