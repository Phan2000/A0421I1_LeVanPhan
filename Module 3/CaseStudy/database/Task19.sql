use furamadata;

update dich_vu_di_kem
join hop_dong_chi_tiet on hop_dong_chi_tiet.id_dich_vu_di_kem = dich_vu_di_kem.id_dich_vu_di_kem
set dich_vu_di_kem.gia = gia*2
where hop_dong_chi_tiet.so_luong >= 10;