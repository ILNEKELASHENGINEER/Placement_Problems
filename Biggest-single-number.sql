# Write your MySQL query statement below
select max(num) num from(
    select max(num) num
    from MyNumbers 
    group by num 
    having count(num)=1
    )s;
