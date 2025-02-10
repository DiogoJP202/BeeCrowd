SELECT cust.id, cust.name
FROM customers AS cust
WHERE NOT EXISTS (
    SELECT 1 
    FROM locations AS loca 
    WHERE cust.id = loca.id_customers
)
ORDER BY cust.id;