# Notas do aluno
N1,N2,N3,N4 = input().split(" ")

N1 = float(N1)
N2 = float(N2)
N3 = float(N3)
N4 = float(N4)

# Pesos de cada nota
P1 = 2
P2 = 3
P3 = 4
P4 = 1

media = (N1 * P1 + N2 * P2 + N3 * P3 + N4 * P4) / (P1 + P2 + P3 + P4)

print(f"Media: {media:.1f}")

if media >= 7:
    print("Aluno aprovado.")
elif media < 5:
    print("Aluno reprovado.")
elif media >= 5 and media < 7:
    print("Aluno em exame.")

    N5 = float(input())
    print(f"Nota do exame: {N5:.1f}")
    
    mediaFinal = (media + N5) / 2
    if mediaFinal >= 5:
        print("Aluno aprovado.")
    else:
        print("Aluno reprovado.")
    print(f"Media final: {mediaFinal:.1f}")
