par = 0
impar = 0
pos = 0
neg = 0

for _ in range(5):
    number = int(input())

    if number > 0: pos += 1
    elif number < 0: neg += 1

    if number % 2 == 0: par += 1
    else: impar += 1

print(f"{par} valor(es) par(es)")
print(f"{impar} valor(es) impar(es)")
print(f"{pos} valor(es) positivo(s)")
print(f"{neg} valor(es) negativo(s)")