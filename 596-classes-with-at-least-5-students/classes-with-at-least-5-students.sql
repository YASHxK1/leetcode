# Write your MySQL query statement below
#select count(class) as cl from Courses;

SELECT class FROM Courses GROUP BY class HAVING COUNT(DISTINCT student) >= 5;
