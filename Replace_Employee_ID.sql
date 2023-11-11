# Write your MySQL query statement below
select ex.unique_id as unique_id, e.name as name 
from Employees e left join EmployeeUNI ex on e.id = ex.id;
