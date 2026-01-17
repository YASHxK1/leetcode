# Write your MySQL query statement below
-- select manager_id as employee_id from Employees where salary < 30000 and manager_id is not null;
SELECT e.Employee_id FROM Employees as e 
    LEFT JOIN Employees as m ON e.manager_id = m.employee_id
        WHERE e.salary < 30000
    AND e.manager_id IS NOT NULL
    AND m.employee_id is null
ORDER BY e.employee_id; 
