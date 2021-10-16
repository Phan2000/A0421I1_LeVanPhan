use furamadata;

select khach_hang.*, count(hop_dong.id_hop_dong) as so_lan
from khach_hang
inner join hop_dong on khach_hang.id_khach_hang=hop_dong.id_khach_hang
where id_loai_khach = 1
group by id_khach_hang
order by so_lan;