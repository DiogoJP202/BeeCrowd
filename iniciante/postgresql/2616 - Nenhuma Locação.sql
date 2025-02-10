SELECT cust.id, cust.name
FROM customers AS cust
LEFT OUTER JOIN locations AS loca
ON cust.id = loca.id_customers
WHERE loca.id_customers IS null
ORDER BY cust.id;

-- WHERE NOT EXISTS (
--     SELECT 1 
--     FROM locations AS loca 
--     WHERE cust.id = loca.id_customers
-- )