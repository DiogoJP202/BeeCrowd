X = int(input(''))
Y = int(input(''))
Z = 0

while X != Y:
    if X > Y:
        temp = X
        X = Y
        Y = temp
    X+=1
    if X % 2 == 0 and X != Y:
        Z += X
        
print(Z)