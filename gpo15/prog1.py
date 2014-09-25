#
# Este es un archivo de python
#

sem1=1
sem2=1

numero = raw_input("Cuantos numeros quiere: ")
numero = int(numero)

nuevo_numero=0
for i in range(1,numero):
	nuevo_numero = sem1 + sem2
	print(nuevo_numero)

	sem1 = sem2
	sem2 = nuevo_numero


