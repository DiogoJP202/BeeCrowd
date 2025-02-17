(SELECT 'Podium: ' || team 
FROM league 
ORDER BY position
LIMIT 3)
UNION ALL
(SELECT 'Demoted: ' || team
FROM league 
WHERE position IN (14, 15)
LIMIT 2);