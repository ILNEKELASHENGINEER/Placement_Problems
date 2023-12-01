# Write your MySQL query statement below
Select product_id, new_price as price 
from Products
where (product_id, change_date) in (
    select product_id, max(change_date) as newestChange
    from Products
    where change_date <= STR_TO_DATE('2019-08-16', '%Y-%m-%d')
    group by product_id)
Union 
Select product_id, 10 as price 
from Products
where (product_id) not in (
    select product_id
    from Products
    where change_date <= STR_TO_DATE('2019-08-16', '%Y-%m-%d')
    group by product_id)

order by product_id

    
