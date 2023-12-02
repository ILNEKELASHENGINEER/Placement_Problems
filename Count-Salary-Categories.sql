# Write your MySQL query statement below
select t.cat category, (count(*) - 1) accounts_count
from 
(
select if(income < 20000, 'Low Salary', if(income > 50000, 'High Salary', 'Average Salary')) cat
from accounts
union all (select 'Low Salary')
union all (select 'High Salary')
union all (select 'Average Salary')
) as t
group by t.cat
