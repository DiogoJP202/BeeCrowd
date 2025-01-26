select prod.id , prod.name
from products as prod
inner join categories as cate
on prod.id_categories = cate.id
where cate.name like 'super%';