N = int(input())

for _ in range(N):
    ptJoao = 0
    ptMaria = 0

    for _ in range(3):
        X, D = map(int, input().split(" "))
        ptJoao += X * D

    for _ in range(3):
        X, D = map(int, input().split(" "))
        ptMaria += X * D
    
    if ptJoao > ptMaria: print('JOAO')
    else: print('MARIA')