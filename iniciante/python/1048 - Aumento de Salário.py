def ajuste(salario):
    if salario <= 400:
        return 15
    elif salario <= 800:
        return 12
    elif salario <= 1200:
        return 10
    elif salario <= 2000:
        return 7
    else:
        return 4
    
salario = float(input())
aumento = ajuste(salario)
novoSalario = salario * (1 + (aumento/100))
ganho = novoSalario - salario

print(f"Novo salario: {novoSalario:.2f}")
print(f"Reajuste ganho: {ganho:.2f}")
print(f"Em percentual: {aumento} %")