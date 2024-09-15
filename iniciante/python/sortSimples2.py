# A função map() no Python é usada para aplicar uma função a todos os itens de um iterável (como uma lista ou uma sequência).
# No caso do código anterior, map(int, input().split()), a função map() aplica a função int a cada elemento da lista resultante de input().split().
num1, num2, num3 = map(int, input().split())

# Ordena os números em ordem crescente
sorted_nums = sorted([num1, num2, num3])

# Imprime os números em ordem crescente
for num in sorted_nums:
    print(num)

# Imprime os números na ordem original
print('')
print(num1)
print(num2)
print(num3)
