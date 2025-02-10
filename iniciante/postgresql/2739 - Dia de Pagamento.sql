SELECT name, 
-- 'EXTRACT' pega o dia de uma data.
-- ::int é um casting para número inteiro no postgre
EXTRACT(DAY FROM payday)::int AS day
FROM loan;