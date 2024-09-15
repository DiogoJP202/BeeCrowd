valor = float(input())

n100 = valor // 100
valor %= 100

n50 = valor // 50
valor %= 50

n20 = valor // 20
valor %= 20

n10 = valor // 10
valor %= 10

n5 = valor // 5
valor %= 5

n2 = valor // 2
valor %= 2

n1 = valor // 1
valor %= 1

n050 = valor // 0.5
valor %= 0.5

n025 = valor // 0.25
valor %= 0.25

n010 = valor // 0.1
valor %= 0.1

n005 = valor // 0.05
valor %= 0.05

n001 = valor / 0.01
valor %= 0.01

print(f'NOTAS:')
print(f'{n100:.0f} nota(s) de R$ 100.00')
print(f'{n50:.0f} nota(s) de R$ 50.00')
print(f'{n20:.0f} nota(s) de R$ 20.00')
print(f'{n10:.0f} nota(s) de R$ 10.00')
print(f'{n5:.0f} nota(s) de R$ 5.00')
print(f'{n2:.0f} nota(s) de R$ 2.00')
print(f'MOEDAS:')
print(f'{n1:.0f} moeda(s) de R$ 1.00')
print(f'{n050:.0f} moeda(s) de R$ 0.50')
print(f'{n025:.0f} moeda(s) de R$ 0.25')
print(f'{n010:.0f} moeda(s) de R$ 0.10')
print(f'{n005:.0f} moeda(s) de R$ 0.05')
print(f'{n001:.0f} moeda(s) de R$ 0.01')
