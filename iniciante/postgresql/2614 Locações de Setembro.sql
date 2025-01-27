SELECT cus.name, ren.rentals_date 
FROM rentals AS ren
INNER JOIN customers AS cus 
ON ren.id_customers = cus.id
WHERE ren.rentals_date >= '2016-09-01'
AND ren.rentals_date <= '2016-09-30';