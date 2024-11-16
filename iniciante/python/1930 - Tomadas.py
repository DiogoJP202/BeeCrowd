valores = input().split(" ")
totalTomadas = -3

for i in range(len(valores)):
    totalTomadas += int(valores[i])

print(totalTomadas)