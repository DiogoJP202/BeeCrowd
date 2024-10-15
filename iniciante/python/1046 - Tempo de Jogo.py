horaInicial, horaFinal = map(int, input().split(" "))
duracao = 0

if horaInicial == horaFinal:
    duracao = 24
else:
    if horaInicial > horaFinal:
        while horaInicial > horaFinal:
            if horaInicial == 24:
                duracao += horaFinal
                break
            horaInicial += 1
            duracao += 1
    else:
        while horaInicial < horaFinal:
            if horaInicial == 24:
                duracao += horaFinal
                break
            horaInicial += 1
            duracao += 1
print(f"O JOGO DUROU {duracao} HORA(S)")