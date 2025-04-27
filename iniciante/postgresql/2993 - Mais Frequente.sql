SELECT COUNT(*) AS most_frequent_value
FROM value_table
GROUP BY amount
ORDER BY COUNT(amount) ASC
LIMIT 1;