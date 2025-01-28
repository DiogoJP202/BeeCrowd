SELECT cust.name, orde.id
FROM customers AS cust
INNER JOIN orders AS orde
ON cust.id = orde.id_customers
WHERE orde.orders_date < '2016-07-01';