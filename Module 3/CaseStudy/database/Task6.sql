use furamadata;

select dich_vu.id_dich_vu, dich_vu.ten_dich_vu, dich_vu.dien_tich, dich_vu.chi_phi_thue, loai_dich_vu.ten_loai_dich_vu
from dich_vu
join loai_dich_vu on dich_vu.id_loai_dich_vu = loai_dich_vu.id_loai_dich_vu
join hop_dong on dich_vu.id_dich_vu = hop_dong.id_dich_vu
where dich_vu.id_dich_vu not in (select hop_dong.id_dich_vu from hop_dong where (year(ngay_lam_hop_dong) = 2019) 
and (month(ngay_lam_hop_dong) in (01,02,03)));
