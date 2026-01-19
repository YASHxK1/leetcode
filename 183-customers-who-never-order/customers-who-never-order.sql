# Write your MySQL query statement below
select cos.name as Customers from customers as cos where cos.id not in (select ord.customerId from orders as ord);

-- select name from customers as cos inner join orders as ord on cos.id= ord.customerId;