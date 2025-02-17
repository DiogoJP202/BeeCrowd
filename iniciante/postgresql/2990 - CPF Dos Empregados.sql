SELECT emp.cpf, emp.enome, dep.dnome
FROM empregados AS emp
INNER JOIN departamentos AS dep
ON emp.dnumero = dep.dnumero
WHERE NOT EXISTS(
    SELECT * FROM empregados AS ep
    INNER JOIN trabalha AS tr
    ON ep.cpf = tr.cpf_emp
) ORDER BY emp.cpf;