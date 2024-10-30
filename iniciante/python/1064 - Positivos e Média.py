positivos = 0
soma = 0.0

for _ in range(6):
    numero = float(input())

    if numero > 0:
        soma += numero
        positivos += 1

media = soma / positivos

print(f"{positivos} valores positivos")
print(f"{media:.1f}")