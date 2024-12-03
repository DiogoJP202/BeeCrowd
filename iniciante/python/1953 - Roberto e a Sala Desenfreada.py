while True:
    n = int(input())
    epr = 0
    ehd = 0 
    intr = 0

    for _ in range(n):
        cod, curso = map(int, input().split(" "))
        if curso == "EPR": epr += 1
        elif curso == "EHD": ehd += 1
        else: intr += 1

    print("EPR: ", epr)
    print("EHD: ", ehd)
    print("INTRUSOS: ", intr)