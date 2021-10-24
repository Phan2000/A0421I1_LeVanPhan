use furamadata;

select hop_dong.id_hop_dong, nhan_vien.ho_ten as nhan_vien, khach_hang.ho_ten as khach_hang, khach_hang.sdt, loai_dich_vu.ten_loai_dich_vu, count(id_hop_dong_chi_tiet) as so_luong_dich_vu_di_kem, sum(tien_dat_coc) as tien_dat_coc
from hop_dong
left join khach_hang on hop_dong.id_khach_hang = khach_hang.id_khach_hang
left join dich_vu on dich_vu.id_dich_vu = hop_dong.id_dich_vu
left join loai_dich_vu on loai_dich_vu.id_loai_dich_vu = dich_vu.id_loai_dich_vu
left join hop_dong_chi_tiet on hop_dong.id_hop_dong = hop_dong_chi_tiet.id_hop_dong
left join dich_vu_di_kem on hop_dong_chi_tiet.id_dich_vu_di_kem = dich_vu_di_kem.id_dich_vu_di_kem
left join nhan_vien on nhan_vien.id_nhan_vien = hop_dong.id_nhan_vien 
where (year(ngay_lam_hop_dong)= 2019  
and month(ngay_lam_hop_dong) between 10 and 12) 
not in(year(ngay_lam_hop_dong)= 2019  
and month(ngay_lam_hop_dong) between 1 and 9)
group by id_hop_dong;