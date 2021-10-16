use furamadata;
-- Task 1: thêm thông tin cho tất cả các bảng
insert into vi_tri(ten_vi_tri)
values ('Le Tan'),
	   ('Phuc Vu'),
       ('Chuyen Vien'),
       ('Giam Sat'),
       ('Quan Ly'),
       ('Giam Doc');

insert into trinh_do (trinh_do)
values ('Trung Cap'),
	   ('Cao Dang'),
       ('Dai Hoc'),
       ('Sau Dai Hoc');

insert into bo_phan (ten_bo_phan)
values ('Sale-Marketing'),
	   ('Hanh Chinh'),
       ('Phuc Vu'),
       ('Quan Ly');

insert into nhan_vien(ho_ten, id_vi_tri, id_trinh_do, id_bo_phan, ngay_sinh, so_cnnd, luong, sdt, email, dia_chi)
values ('Lê Công Thiện', 1, 2, 2,'2000-12-20', '123742626', 12000000, 0968748372, 'muaNho24@gmail.com', 'Quảng Ngãi'),
	   ('Lê Minh Vương', 2, 2, 2, '2000-01-13', '178123612', 15000000, 0254615262, 'Minhvuong2k@gmail.com', 'Đà Nẵng'),
	   ('Nguyễn Hoàng Nam', 3, 1, 3, '1996-07-11', '178288237',9000000, 0389627452, 'Hoangnam1234@sv.vn', 'Quảng Trị'),
       ('Hoàng Văn Ngọc', 4, 3, 2, '1994-05-29', '135645786', 21000000, 0987654765, 'hvngoc94@gmail.com', 'Thái Bình'),
       ('Phạm Huy Hoàng', 5, 4, 4, '1989-11-12', '175077546',25000000, 0345765999, 'Phuyhoangql@gmail.com', 'Hà Nội'),
       ('Trần Văn Khiêm', 6, 4, 4, '1989-05-13', '198789777', 27000000, 0969722103, 'Khiemtran89@gmail.com', 'Quảng Bình'),
       ('Lê Thị Thu', 2, 3, 4, '1995-02-12', 206184291, 10000000, 0905453657, 'lethu@gmail.com', 'Đà Nẵng'),
	   ('Trương Văn Tuấn', 2, 3, 1, '1989-02-09', 206915647, 10000000, 0909452456, 'vantuan@gmail.com', 'Hồ Chí Minh'),
       ('Trần Khánh Chi', 3, 3, 2, '1991-12-17', 202914563, 20000000, 0905567345, 'tranchi@gmail.com', 'Hà Nội');

insert into loai_khach(ten_loai_khach)
values ('Diamond'),
	   ('Platinium'),
       ('Gold'),
       ('Silver'),
       ('Member');	

insert into khach_hang(id_loai_khach, ho_ten, ngay_sinh, so_cnnd, sdt, email, dia_chi)
values (2, 'Nguyen Truong Giang', '1990-05-20', '176546277', '0974251450', 'Giangnt@gmail.com', 'Thanh Hóa'),
	   (3, 'Hoang Ngoc Duyen', '1999-03-23', '176452723', '0325456879', 'Duyenhn@gmail.com', 'Hà Giang'),
       (1, 'Lê Hồng Quang', '1989-05-17', '253416526', '0954785424', 'Hquangt@agmail.com', 'Nghệ An'),
       (4, 'Trần Đình Giang', '1995-11-21', '187678546', '0987656341', 'Giangtd@gmail.com', 'Quảng Trị'),
       (5, 'Dương Văn Tuấn', '1987-03-12', '134524757', '0967546624', 'Ninhdz@gmail.com', 'Đà Nẵng'),
	   (2, 'Nguyễn Anh Sơn','1989-02-09','234345345','090543454','nguyendoan@gmail.com','Haỉ Dương'),
	   (3, 'Hồ Ngọc Phi Khanh','1991-12-17','223445398','095643457','nguyenanh@gmail.com','Quảng Bình');

insert into loai_dich_vu(ten_loai_dich_vu)
values ('Villa'),
	   ('House'),
       ('Room');

insert into kieu_thue (ten_kieu_thue, gia)
values ('Năm',90000000),
	   ('Tháng',1200000),
       ('Ngày',2000000),
       ('Giờ',200000);

insert into dich_vu (ten_dich_vu, dien_tich, so_tang, so_nguoi_toi_da, chi_phi_thue, id_kieu_thue, id_loai_dich_vu, trang_thai)
values ('Villa', 300, 2, '9', 15000000, 3, 1, 'Good'),
	   ('House', 100, 2, '7', 7000000, 3, 2, 'Good'),
       ('Room', 30, 1, '3', 3000000, 3, 3, 'Good');

insert into hop_dong (id_nhan_vien, id_khach_hang, id_dich_vu, ngay_lam_hop_dong, ngay_ket_thuc, tien_dat_coc, tong_tien)
values (2, 1, 1, '2020-12-12', '2021-01-02', 3000000, 5000000),
	   (3, 4, 3, '2021-01-12', '2021-01-20', 400000, 7000000),
       (5, 3, 2, '2020-03-12', '2021-03-22', 5000000, 10000000);

insert into dich_vu_di_kem (ten_dich_vu_di_kem, gia, don_vi, trang_thai )
values ('massage', 500000, '1 giò', 'San sang'),
	   ('karaoke', 300000, '1 giờ', 'San sang'),
       ('thức ăn', 70000, '1 phần', 'San sang'),
       ('nước uống', 15000, '1 chai', 'San sang'),
       ('thuê xe', 999000, '1 lượt', 'San sang');

insert into hop_dong_chi_tiet (id_hop_dong, id_dich_vu_di_kem, so_luong)
values (2,2,3),
	   (1,1,2),
       (3,4,2);