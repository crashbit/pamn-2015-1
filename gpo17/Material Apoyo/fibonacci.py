#
# Programa que realiza la serie de finonacci
#

## Consideremos nuetras semillas

sem1 = 1
sem2 = 1

## Ahora vamos a generar un numero

num_gen = sem1 + sem2

## Imprimimos nuestro numero generado en pantalla

print("Numero de fibonacci generado: ")
print(num_gen)
print("\n")
## ahora vamos a generar 5 numeros usando un ciclo "for"
## usaremos nuestras 2 primeras semillas

for i in range(1,5):
	num_gen = sem1 + sem2
	print 'Numero %d' % num_gen

	#creamos nuevas semillas (recorremos valores)
	sem1 = sem2
	sem2 = num_gen

## Pediremos un numero desde el teclado
#
numero = raw_input("Cuantos numeros desea generar: ")
#"numero" lo recibimos como un string hay que pasarlo a int

numero = int(numero)
## Reseteamos nuestras semillas
sem1 = 1
sem2 = 1
for i in range(1,numero):
	num_gen = sem1 + sem2
	print 'Numero %d' % num_gen

	#creamos nuevas semillas (recorremos valores)
	sem1 = sem2
	sem2 = num_gen

#Ahora el resultado lo mandamos a un archivo
archivo = open('fibonacci.txt', 'w')

#Volvemos a generar numeros con la entrada del usuario
sem1 = 1
sem2 = 1
for i in range(1,numero):
	num_gen = sem1 + sem2
	print 'Numero %d' % num_gen
	archivo.write('Numero %d\n' % num_gen)

	#creamos nuevas semillas (recorremos valores)
	sem1 = sem2
	sem2 = num_gen

#Cerramos el archivo
archivo.close()


