import os

def imprime(valor):
	if valor < 0:
		return "menor"
	else:
		return "mayor"

os.system("cls")
z = imprime
print z(2)