N = int(input())
distanciaTotal = 0

for _ in range(N):
    T, V = map(int, input().split(" "))
    distanciaTotal += T * V

print(distanciaTotal)