N = int(input())

for _ in range(N):
    X = int(input())
    for i in range(2, X + 1):
        if X % i == 0 and X != i:
            print(f'{X} nao eh primo')
            break
        elif X == i:
            print(f'{X} eh primo')