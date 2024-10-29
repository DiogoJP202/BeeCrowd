horaInicial, minutoInicial, horaFinal, minutoFinal = map(int, input().split(" "))

# Converte o tempo inicial e final para minutos totais
inicio = horaInicial * 60 + minutoInicial
fim = horaFinal * 60 + minutoFinal

# Calcula a duração em minutos
if fim <= inicio:
    duracao = (24 * 60 - inicio) + fim  # Lida com o caso de virada do dia
else:
    duracao = fim - inicio

# Converte a duração de minutos para horas e minutos
duracaoH = duracao // 60
duracaoM = duracao % 60

print(f"O JOGO DUROU {duracaoH} HORA(S) E {duracaoM} MINUTO(S)")