def verificarDDD(DDD):
    estado = ""
    if DDD == 61:
        estado = "Brasilia"
    elif DDD == 71:
        estado = "Salvador"
    elif DDD == 11:
        estado = "Sao Paulo"
    elif DDD == 21:
        estado = "Rio de Janeiro"
    elif DDD == 32:
        estado = "Juiz de Fora"
    elif DDD == 19:
        estado = "Campinas"
    elif DDD == 27:
        estado = "Vitoria"
    elif DDD == 31:
        estado = "Belo Horizonte"
    else:
        estado = "DDD nao cadastrado"
    return estado

DDD = int(input())
print(verificarDDD(DDD))