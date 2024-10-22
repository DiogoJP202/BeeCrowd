def formataNumeros3Casas(n):
    if n < 10: return f"00{n}"
    elif n < 100: return f"0{n}"
    return n
    
def formataNumeros2Casas(n):
    if n < 10: return f"0{n:.2f}"
    return f"{n:.2f}"

def mostrarNotas(qtdAlunos, notasAlteradas, notasInicial, notasFinal):
    print(f"NOTAS ALTERADAS: {notasAlteradas}")
    for i in range(0, qtdAlunos):
        if notasInicial[i] == notasFinal[i]:
            print(f"-({formataNumeros3Casas(i + 1)}) original: {formataNumeros2Casas(notasInicial[i])} | final: {formataNumeros2Casas(notasFinal[i])}")
        else:
            print(f"*({formataNumeros3Casas(i + 1)}) original: {formataNumeros2Casas(notasInicial[i])} | final: {formataNumeros2Casas(notasFinal[i])}")
        i += 1

alunos = int(input())
notasOriginais = alunos * [0]
notasComplementarees = alunos * [0]
notasFinais = alunos * [0]
notasAlteradas = 0

i = 0
while i < alunos:
    notasOriginais[i] = float(input())
    i += 1
    
i = 0
while i < alunos:
    notasComplementarees[i] = float(input())
    if notasOriginais[i] < 10 and notasComplementarees[i] == 10:
        notasAlteradas += 1
        notasFinais[i] = notasOriginais[i] + 2
        if notasFinais[i] > 10: notasFinais[i] = 10
    else:
        notasFinais[i] = notasOriginais[i]
    i += 1

mostrarNotas(alunos, notasAlteradas, notasOriginais, notasFinais)