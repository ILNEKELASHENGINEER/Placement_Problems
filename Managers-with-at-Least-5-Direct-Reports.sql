# Write your MySQL query statement below
SELECT a.name
from Employee a
JOIN Employee b on a.id = b.managerId
GROUP BY b.managerId
HAVING COUNT(*)>=5
