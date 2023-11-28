# Write your MySQL query statement below
SELECT customer_id 
FROM(
    SELECT customer_id , COUNT(DISTINCT product_key) AS cnt
    FROM Customer
    GROUP BY customer_id
    HAVING cnt = (SELECT COUNT(*) FROM Product)
) Temp;
