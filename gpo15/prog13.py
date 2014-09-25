archivo = open("CPdescarga.txt", "r")

lista = []

for cp in archivo:
	lista.append(cp)

print len(lista)

print lista[3].split("|")[0]