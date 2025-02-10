SELECT name, customers_number
FROM lawyers
-- Usando subquery:
WHERE customers_number = (SELECT MAX(customers_number) FROM lawyers)
-- UNION ALL é usado para evitar que o banco de dados elimine duplicatas e mantem a ordem das query do jeito que foram escritas.
UNION ALL 
SELECT name, customers_number
FROM lawyers
WHERE customers_number = (SELECT MIN(customers_number) FROM lawyers)
UNION ALL 
-- Colocando uma informação diretamente na coluna 'first_name'.
-- Não precisamos usar GROUP BY porque não estamos agrupando os dados por nenhuma categoria.
SELECT 'Average', ROUND(AVG(customers_number), 0)
FROM lawyers;