t = input()
respostas = input().split(" ")
respostasCorretas = 0

for resposta in respostas : 
    if resposta == t: respostasCorretas += 1

print(respostasCorretas)