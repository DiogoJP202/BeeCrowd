codigo, qtd = input().split(' ')

codigo = int(codigo)
qtd = int(qtd)

if codigo == 1:
    print(f'Total: R$ {(4.0 * qtd):.2f}')
elif codigo == 2:
    print(f'Total: R$ {(4.5 * qtd):.2f}')
elif codigo == 3:
    print(f'Total: R$ {(5.0 * qtd):.2f}')
elif codigo == 4:
    print(f'Total: R$ {(2.0 * qtd):.2f}')
elif codigo == 5:
    print(f'Total: R$ {(1.5 * qtd):.2f}')
