use furamadata;

select dich_vu_di_kem.*, sum(so_luong) as so_luong, 
count(dich_vu_di_kem.id_dich_vu_di_kem) as so_lan
from  hop_dong_chi_tiet
join dich_vu_di_kem on hop_dong_chi_tiet.id_dich_vu_di_kem = dich_vu_di_kem.id_dich_vu_di_kem
group by id_dich_vu_di_kem;