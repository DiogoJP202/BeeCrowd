number = int(input())

bills100 = 0
bills50 = 0
bills20 = 0
bills10 = 0
bills5 = 0
bills2 = 0
bills1 = 0

print(number)

bills100 = number // 100
number = number % 100
print(bills100, 'nota(s) de R$ 100,00')

bills50 = number // 50
number = number % 50
print(bills50, 'nota(s) de R$ 50,00')

bills20 = number // 20
number = number % 20
print(bills20, 'nota(s) de R$ 20,00')

bills10 = number // 10
number = number % 10
print(bills10, 'nota(s) de R$ 10,00')

bills5 = number // 5
number = number % 5
print(bills5, 'nota(s) de R$ 5,00')

bills2 = number // 2
number = number % 2
print(bills2, 'nota(s) de R$ 2,00')

bills1 = number // 1
number = number % 1
print(bills1, 'nota(s) de R$ 1,00')
