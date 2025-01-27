SELECT mov.id, mov.name 
FROM movies AS  mov
INNER JOIN prices AS pri
ON mov.id_prices = pri.id
WHERE pri.value < 2;