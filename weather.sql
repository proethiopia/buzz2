create table weather (

temp_id int,
record_date date,
temperature int
);
select temp_id from weather 
where temperature = ( select max(temperature) from weather)