use furamadata;

delete from khach_hang
where id_khach_hang in (select id_khach_hang from hop_dong where year(ngay_lam_hop_dong) < 2016);
