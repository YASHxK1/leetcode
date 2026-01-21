# Write your MySQL query statement below
    select orders.customer_number from orders group by  customer_number order by count(*)desc limit 1;

-- SELECT customer_number
--   FROM Orders
--  GROUP BY customer_number
--  ORDER BY count(*) DESC
--  LIMIT 1; 