def func1(texto, veces=1):
	print texto * veces

def func2(var1, var2, *otros):
	print var1
	print var2
	for var in otros:
		print var

def func3(var1, **otros):
	print otros

def func4():
	return "1", "3", "4"

func1("Hola ", 7)
func2(1, 2, 3, 4, 5, 6, 7)
func3("adios", tercero=2)
a,b,c = func4()
print a, b, c