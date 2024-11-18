N = int(input())
num = int(input())
cont = 1

for _ in range(N - 1):
    temp = num
    num = int(input())
    if temp != num: cont += 1

print(cont)