n = int(input())
i = 1
x = n

while i < n:
    x *= n - i
    i += 1
    
print(x)
