# Write your MySQL query statement below
select s.product_id, s.year as first_year, s.quantity, s.price
from Sales s
join (select product_id, min(year) as year from sales group by product_id) ss
on s.product_id = ss.product_id and s.year = ss.year
