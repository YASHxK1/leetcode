# Write your MySQL query statement below
with CTE as (
select Email,min(id) as keep 
from Person group by Email 
)
delete from Person where ID not in (select keep from CTE);