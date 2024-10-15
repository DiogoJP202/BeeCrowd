# Sorted Ordena os valores. reverse faz com que ele Ordene de forma decrescente.
A, B, C = sorted(map(float, input("").split()), reverse=True)

if A >= B + C:
    print("NAO FORMA TRIANGULO")
else:
    if A ** 2 == B ** 2 + C ** 2:
        print("TRIANGULO RETANGULO")
    elif A ** 2 > B ** 2 + C ** 2:
        print("TRIANGULO OBTUSANGULO")
    elif A ** 2 < B ** 2 + C ** 2:
        print("TRIANGULO ACUTANGULO")
    
    if A == B == C:
        print("TRIANGULO EQUILATERO")
    elif A == B or B == C or A == C:
        print("TRIANGULO ISOSCELES")