use furamadata;
 
select *
from nhan_vien
where (ho_ten like ('H%')
	or ho_ten like ('T%')
	or ho_ten like ('K%')) 
    and CHARACTER_LENGTH(ho_ten) <= 15;