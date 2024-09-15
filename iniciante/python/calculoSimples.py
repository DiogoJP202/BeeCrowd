codP1, numP1, valorP1 = input().split(' ')
codP2, numP2, valorP2 = input().split(' ')

codP1 = int(codP1)
codP2 = int(codP2)
numP1 = int(numP1)
numP2 = int(numP2)
valorP1 = float(valorP1)
valorP2 = float(valorP2)

valorTotal = (numP1 * valorP1) + (numP2 * valorP2)

print(f'VALOR A PAGAR: R$ {valorTotal:.2f}')
