insert into weather (temp_id,record_date, temperature)
values (1,'2015-01-01', 10 );
insert into weather (temp_id,record_date, temperature)
values (2,'2015-01-02', 25 );
insert into weather (temp_id,record_date, temperature)
values ( 3,'2015-01-03', 20 );
insert into weather (temp_id,record_date, temperature)
values (4,'2015-01-04', 30 );


select  s.temp_id from weather s
 join weather d on s.record_date   = d.record_date +  interval '1 day'
where s.temperature > d.temperature
select * from weather
