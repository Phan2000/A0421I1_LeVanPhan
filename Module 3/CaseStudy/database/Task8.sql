use furamadata;

-- C1:
select khach_hang.ho_ten
from khach_hang
union
select khach_hang.ho_ten
from khach_hang;

-- C2:
select distinct khach_hang.ho_ten
from khach_hang
group by khach_hang.ho_ten;

