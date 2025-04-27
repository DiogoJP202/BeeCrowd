SELECT e.cpf, e.enome, d.dnome
FROM empregados e 
INNER JOIN departamentos d 
    ON e.dnumero = d.dnumero
WHERE NOT EXISTS (SELECT 1 FROM trabalha WHERE e.cpf = cpf_emp)
ORDER BY e.cpf;