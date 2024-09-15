from math import sqrt

A,B,C = input().split(' ')

A = float(A)
B = float(B)
C = float(C)

# Calcula o Delta
D = B ** 2 - 4 * A * C

if D < 0 or A == 0:
    print("Impossivel calcular")
else:
    # Calcula as raízes usando a fórmula de Bhaskara
    R1 = (- B + sqrt(D)) / (2 * A)
    R2 = (- B - sqrt(D)) / (2 * A)

    print(f'R1 = {R1:.5f}')
    print(f'R2 = {R2:.5f}')
