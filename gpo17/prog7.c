#include <stdio.h>
#include <string.h>

int main(){
	
	struct Alumno{
		char nombre[30];
		int edad;
		float promedio;
	};

	struct Alumno fi[10];

	strcpy(fi[0].nombre, "Luis");
	fi[0].edad = 30;
	fi[0].promedio = 6.0;

	printf("\n %s , %d , %f ", fi[0].nombre, fi[0].edad, fi[0].promedio);
	printf("\n\n");



	return 0;
}