A, B, C = map(float, input().split(' '))

perimetro = A + B + C
area = ((A + B) * C) / 2

if B + C > A and A + C > B and A + B > C:
    print(f'Perimetro = {perimetro:.1f}')
else:
    print(f'Area = {area:.1f}')
