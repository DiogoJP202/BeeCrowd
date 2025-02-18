SELECT lr.name, ROUND(lr.omega * 1.618, 3) AS "Fator N"
FROM dimensions AS dm
INNER JOIN life_registry AS lr
ON dm.id = lr.dimensions_id 
WHERE dm.name IN ('C875', 'C774')
AND lr.name LIKE '%Richard%'
ORDER BY lr.omega ASC;