# Write your MySQL query statement below
select uni.unique_id, e.name
from employees e
left join employeeUNI uni
on uni.id = e.id;