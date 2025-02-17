SELECT name, 
(COUNT(m.team_1) + COUNT(m.team_2)) AS matches, 
() AS victories, 
() AS defeats, 
() AS draws, 
() AS score
FROM teams AS t
INNER JOIN matches AS m
ON t.id = m.team_1 OR t.id = m.team_2;