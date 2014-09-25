palabra = "hola calabaza"

for letra in palabra:
	letra

print len(palabra)


print palabra.count("a")
print palabra.find("h")
print palabra.index("calabaza")
print palabra[0:-2]
print palabra.split(' ')
print palabra.startswith('h')
print palabra.endswith('o')