use furamadata;

select hop_dong.id_hop_dong, ngay_lam_hop_dong, ngay_ket_thuc, tien_dat_coc, count(ID_hop_dong_chi_tiet) as so_luong
from hop_dong
join hop_dong_chi_tiet on hop_dong.id_hop_dong = hop_dong_chi_tiet.id_hop_dong
group by id_hop_dong;