# Write your MySQL query statement below
#1378. Replace Employee ID With The Unique Identifier
select Eu.unique_id,
       E.name 
from Employees as E 
left join EmployeeUNI as Eu 
on Eu.ID = E.id;