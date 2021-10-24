use furamadata;

update khach_hang
set id_loai_khach = 1
where id_loai_khach=2 and id_khach_hang 
in (select id_khach_hang from hop_dong where hop_dong.tong_tien >= 10000000 );
