valor = 0
contador = 0
continuar = True

while continuar:
    entrada = int(input())
    if entrada < 0:
        continuar = False
    else:
        valor += entrada
        contador += 1

media = valor / contador

print(f"{media:.2f}")