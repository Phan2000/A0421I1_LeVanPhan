use furamadata;

select * from khach_hang
where round(datediff(curdate(), ngay_sinh)/365, 0) between 18 and 50
and dia_chi like 'Đà Nẵng' or 'Quảng Trị';