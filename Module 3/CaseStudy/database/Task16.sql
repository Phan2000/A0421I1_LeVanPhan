use furamadata;

delete from nhan_vien
where nhan_vien.id_nhan_vien <> (select id_nhan_vien from hop_dong 
where year(ngay_lam_hop_dong) between 2017 and 2019
);
