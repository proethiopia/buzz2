select 
p.id ,
p.first_name,
p.last_name,
adi.street_name,
adi.street_number,
adi.city,
adi.state,
adi.zipcode

from address_info adi
left join address ad on ad.address_id =adi.address_id
join  person p on ad.id =p.id 