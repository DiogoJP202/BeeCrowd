x = [0] * 10

for i in range(10):
    x[i] = int(input())
    if x[i] <= 0 or x[i] == '': x[i] = 1

for i in range(10):
    print(f'X[{i}] = {x[i]}')