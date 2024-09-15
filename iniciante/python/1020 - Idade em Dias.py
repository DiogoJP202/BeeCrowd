idadeDias = int(input())

idadeAnos = idadeDias // 365
idadeDias = idadeDias % 365

idadeMeses = idadeDias // 30
idadeDias = idadeDias % 30

print(idadeAnos, 'ano(s)')
print(idadeMeses, 'mes(es)')
print(idadeDias, 'dia(s)')
