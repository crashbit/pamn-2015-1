class Alumno:
	def __init__(self, nombre = "nobody", edad=0, numCuenta="000000000"):
		print("Construyendo Alumno")
		self.nombre =nombre
		self.edad = edad
		self.numCuenta = numCuenta



fabiola = Alumno("fabiola")

print (fabiola.nombre)
