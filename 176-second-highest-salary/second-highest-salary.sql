# Write your MySQL query statement below

select MAX(salary) as SecondHighestSalary
    FROM Employee
WHERE salary < (select MAX(salary)from Employee);      