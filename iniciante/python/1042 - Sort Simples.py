num1, num2, num3 = map(int, input().split(' '))

if num1 < num2 and num1 < num3:
    print(num1)
    if num2 < num3:
        print(num2)
        print(num3)
    else:
        print(num3)
        print(num2)
elif num2 < num3 and num2 < num1:
    print(num2)
    if num1 < num3:
        print(num1)
        print(num3)
    else:
        print(num3)
        print(num1)
elif num3 < num1 and num3 < num2:
    print(num3)
    if num1 < num2:
        print(num1)
        print(num2)
    else:
        print(num2)
        print(num1)

print('')
print(num1)
print(num2)
print(num3)
