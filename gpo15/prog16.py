def funcion():
	""" Esta es una funcion sin parametros"""
	print "hola mundo"

def funcionParam(var1):
	print var1

def funcionInic(var1 = "Aqui va un saludo"):
	print var1

def funcMasParam(var1=2, var2="Este es otro saludo"):
	print var1
	print var2

funcion()
funcionParam("Saludo en ingles")
funcionInic()
funcMasParam()