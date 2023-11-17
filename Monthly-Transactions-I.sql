# Write your MySQL query statement below
SELECT DATE_FORMAT(trans_date, '%Y-%m') AS month, country, count(*) as trans_count, COUNT(CASE when state = 'approved' THEN 1 ELSE NULL END) as approved_count,
sum(amount) as trans_total_amount,
sum(CASE when state = 'approved' THEN amount else 0 END) as approved_total_amount
FROM Transactions group by country, month
