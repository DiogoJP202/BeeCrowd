number1, number2 = input().split(" ")

number1 = float(number1)
number2 = float(number2)

if number1 % number2 == 0 or number2 % number1 == 0:
    print("Sao Multiplos")
else:
    print("Nao sao Multiplos")
