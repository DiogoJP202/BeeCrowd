SELECT cand.name, 
ROUND(((sr.math * 2 + sr.specific * 3 + sr.project_plan * 5) / 10), 2) AS "avg"
FROM candidate AS cand
INNER JOIN score AS sr
ON cand.id = sr.candidate_id
ORDER BY "avg" DESC;
