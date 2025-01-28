SELECT prod.name, prov.name, cate.name
FROM products AS prod
INNER JOIN providers AS prov
ON prod.id_providers = prov.id
INNER JOIN categories as cate
ON prod.id_categories = cate.id
WHERE prov.name = 'Sansul SA' 
AND cate.name = 'Imported';