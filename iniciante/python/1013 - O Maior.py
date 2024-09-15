a, b, c = map(int, input().split(' '))

x = (a + b + abs(a - b)) / 2
maiorXC = (x + c + abs(x - c)) / 2
maiorXC = int(maiorXC)

print(maiorXC, 'eh o maior')
