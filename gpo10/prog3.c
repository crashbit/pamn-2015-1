#include <stdio.h>
#include <string.h>

int main(){

	struct Alumno{
		char nombre[20];
		int edad;
		float promedio;
	};

	struct Alumno fi[10];

	fi[2].edad = 22;
	fi[2].promedio = 6.0;
	strcpy(fi[2].nombre, "Lola");

	printf("\n %s , %d , %f ", fi[2].nombre, fi[2].edad, fi[2].promedio);
	printf("\n\n");

	return 0;
}
