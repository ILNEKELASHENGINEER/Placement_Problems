# Write your MySQL query statement below

select requester_id as id,
       (select count(*) from RequestAccepted
            where id=requester_id or id=accepter_id) as num
from RequestAccepted
group by requester_id
union 
select accepter_id as id,
    (select count(*) from RequestAccepted  where (requester_id = id or accepter_id = id)) as num
from RequestAccepted
group by accepter_id
order by num desc limit 1; 
                
