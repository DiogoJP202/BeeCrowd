tempoS = int(input())
tempoM = tempoS // 60
tempoS = tempoS % 60
tempoH = tempoM // 60
tempoM = tempoM % 60

print(f'{tempoH}:{tempoM}:{tempoS}')
