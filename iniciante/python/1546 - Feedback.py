N = int(input())
nomes = []
i1 = 0

for _ in range(N):
    K = int(input())
    for _ in range(K):
        num = int(input())
        if num == 1:
            nomes.append(1)
        elif num == 2:
            nomes.append(2)
        elif num == 3:
            nomes.append(3)
        elif num == 4:
            nomes.append(4)
        i1 += 1
                
for i in range(len(nomes)):
    if nomes[i] == 1:
        print("Rolien")
    elif nomes[i] == 2:
        print("Naej")
    elif nomes[i] == 3:
        print("Elehcim")
    elif nomes[i] == 4:
        print("Odranoel")
