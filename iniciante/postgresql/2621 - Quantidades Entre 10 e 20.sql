SELECT prod.name
FROM products AS prod
INNER JOIN providers as prov
ON prod.id_providers = prov.id
WHERE prod.amount BETWEEN 10 AND 20
AND prov.name LIKE 'P%';