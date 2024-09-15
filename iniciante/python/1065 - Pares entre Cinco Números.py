pares = 0

number1 = int(input())
if number1 % 2 == 0:
    pares += 1
    
number2 = int(input())
if number2 % 2 == 0:
    pares += 1
    
number3 = int(input())
if number3 % 2 == 0:
    pares += 1
    
number4 = int(input())
if number4 % 2 == 0:
    pares += 1
    
number5 = int(input())
if number5 % 2 == 0:
    pares += 1

print(f'{pares} valores pares')
