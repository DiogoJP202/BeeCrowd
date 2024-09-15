a, b, c = input().split(' ')

a = int(a)
b = int(b)
c = int(c)

x = (a + b + abs(a - b)) / 2
maiorXC = (x + c + abs(x - c)) / 2
maiorXC = int(maiorXC)

print(maiorXC, 'eh o maior')
