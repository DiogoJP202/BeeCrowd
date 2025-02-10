SELECT cust.name 
FROM customers as cust
INNER JOIN legal_person as lp
ON cust.id = lp.id_customers;