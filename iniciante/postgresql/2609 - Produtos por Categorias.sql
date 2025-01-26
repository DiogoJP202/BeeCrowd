select cate.name, SUM(prod.amount)
from products as prod
inner join categories as cate
on prod.id_categories = cate.id
group by cate.name;