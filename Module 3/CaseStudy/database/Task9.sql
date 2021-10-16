use furamadata;

select month(ngay_lam_hop_dong) as "Thang", sum(dich_vu.chi_phi_thue + hop_dong_chi_tiet.so_luong*dich_vu_di_kem.gia)
as "Tong tien", count(hop_dong.id_khach_hang) as "So khach thue dich vu"
from hop_dong
join dich_vu on hop_dong.id_dich_vu = dich_vu.id_dich_vu
join hop_dong_chi_tiet on hop_dong.id_hop_dong=hop_dong_chi_tiet.id_hop_dong
join dich_vu_di_kem on hop_dong_chi_tiet.id_dich_vu_di_kem = dich_vu_di_kem.id_dich_vu_di_kem
where year(ngay_lam_hop_dong) = 2020
group by month(ngay_lam_hop_dong);
