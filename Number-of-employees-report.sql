# Write your MySQL query statement below
select e1.employee_id,e1.name,COUNT(e2.reports_to) as reports_count,ROUND(AVG(e2.age)) as average_age from Employees e1 
left join Employees e2 on e1.employee_id = e2.reports_to 
where e2.reports_to is not null
group by e2.reports_to
order by e1.employee_id;
