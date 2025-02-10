SELECT prod.name, cate.name
FROM products AS prod
INNER JOIN categories as cate
ON prod.id_categories = cate.id
WHERE prod.amount > 100 AND cate.id IN (1,2,3,6,9)
ORDER BY cate.id ASC;