archivo = open("numeros.txt", "r")
matriz = []
renglon = []



matriz2 = [map(int, linea.split(',')) for linea in archivo]
print matriz2