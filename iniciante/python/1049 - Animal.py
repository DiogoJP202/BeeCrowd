tipoEsqueleto = input()
tipoEsqueleto = tipoEsqueleto.lower()

tipoAnimal = input()
tipoAnimal = tipoAnimal.lower()

tipoAlimentacao = input()
tipoAlimentacao = tipoAlimentacao.lower()

if tipoEsqueleto == "vertebrado":
    if tipoAnimal == "ave":
        if tipoAlimentacao == "carnivoro":
            print("aguia")
        elif tipoAlimentacao == "onivoro":
            print("pomba")
        else:
            print("Erro de entrada")    
    elif tipoAnimal == "mamifero":
        if tipoAlimentacao == "onivoro":
            print("homem")
        elif tipoAlimentacao == "herbivoro":
            print("vaca")
        else:
            print("Erro de entrada")
    else:
        print("Erro de entrada")
elif tipoEsqueleto == "invertebrado":
    if tipoAnimal == "inseto":
        if tipoAlimentacao == "hematofago":
            print("pulga")
        elif tipoAlimentacao == "herbivoro":
            print("lagarta")
        else:
            print("Erro de entrada")    
    elif tipoAnimal == "anelideo":
        if tipoAlimentacao == "hematofago":
            print("sanguessuga")
        elif tipoAlimentacao == "onivoro":
            print("minhoca")
        else:
            print("Erro de entrada")
    else:
        print("Erro de entrada")
else:
    print("Erro de entrada")
